class Solution {
    public int minPartitions(String s) {
       int max = 0;

        for (char c : s.toCharArray()) {
            max = Math.max(max, c - '0');
        }

        return max;
    }
}