class Solution {
    static String dp[][];

    static String f(int i, int j, String s1, String s2){
        if(i < 0 || j < 0) return "";

        if(dp[i][j] != null) return dp[i][j];

        if(s1.charAt(i) == s2.charAt(j)) 
            return dp[i][j] = f(i-1, j-1, s1, s2) + s1.charAt(i);

        String a = f(i-1, j, s1, s2);
        String b = f(i, j-1, s1, s2);

        return dp[i][j] = (a.length() > b.length()) ? a : b;
    }

    public String shortestCommonSupersequence(String s1, String s2) {
        dp = new String[s1.length()][s2.length()];
        String lcs = f(s1.length()-1, s2.length()-1, s1, s2);

        // build SCS from LCS
        int i=0, j=0, k=0;
        StringBuilder sb = new StringBuilder();

        while(k < lcs.length()){
            char c = lcs.charAt(k);

            while(s1.charAt(i) != c) sb.append(s1.charAt(i++));
            while(s2.charAt(j) != c) sb.append(s2.charAt(j++));

            sb.append(c);
            i++; j++; k++;
        }

        sb.append(s1.substring(i));
        sb.append(s2.substring(j));

        return sb.toString();
    }
}
