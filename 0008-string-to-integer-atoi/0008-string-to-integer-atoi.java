class Solution {
    public int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = s.length();

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sb.append(s.charAt(i));
            i++;
        }

        while (i < n) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sb.append(ch);
            } else {
                break; 
            }
            i++;
        }
        if (sb.length() == 0 || sb.toString().equals("+") || sb.toString().equals("-")) {
            return 0;
        }

        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return sb.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
