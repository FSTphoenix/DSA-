class Solution {
    static int dp[][];

    static int f(int i, int j, String s1, String s2){
        if(i < 0) return j + 1;   
        if(j < 0) return i + 1;   

        if(dp[i][j] != -1) return dp[i][j];

        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] = f(i-1, j-1, s1, s2);
        } else {
            return dp[i][j] = 1 + Math.min(
                    f(i-1, j, s1, s2),      
                    Math.min(
                        f(i, j-1, s1, s2),  
                        f(i-1, j-1, s1, s2) 
                    )
            );
        }
    }

    public int minDistance(String s1, String s2) {
        dp = new int[s1.length()][s2.length()];
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[0].length;j++)
                dp[i][j] = -1;

        return f(s1.length()-1, s2.length()-1, s1, s2);
    }
}
