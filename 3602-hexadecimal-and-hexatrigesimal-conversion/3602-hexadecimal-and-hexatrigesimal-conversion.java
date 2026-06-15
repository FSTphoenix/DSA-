class Solution {
    public String concatHex36(int n) {
         String hex = Integer.toHexString(n * n).toUpperCase();
        String base36 = Integer.toString(n * n * n, 36).toUpperCase();

        return hex + base36;
    }
}