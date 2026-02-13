public class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        char[] map = "0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder();

        while (num != 0) {
            int last4bits = num & 0xf;   
            result.append(map[last4bits]);
            num >>>= 4;                 
        }

        return result.reverse().toString();
    }
}