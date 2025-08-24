import java.util.Stack;

class Solution {
    public String removeKdigits(String s, int k) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (!st.isEmpty() && k > 0 && st.peek() > c) {
                st.pop();
                k--;
            }
            st.push(c);
        }

        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        res.reverse();
        int idx = 0;
        while (idx < res.length() && res.charAt(idx) == '0') {
            idx++;
        }

        String finalStr = (idx == res.length()) ? "0" : res.substring(idx);
        return finalStr;
    }
}
