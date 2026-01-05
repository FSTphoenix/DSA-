class Solution {
    static int dp[][];
    static int[][] arr;   
    static int f(int i, int j){
        if(i == 0 && j == 0) return arr[0][0] == 1 ? 0 : 1;
        if(i < 0 || j < 0) return 0;
        if(arr[i][j] == 1) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        int up = f(i-1, j);
        int left = f(i, j-1);

        return dp[i][j] = up + left;
    }

    public int uniquePathsWithObstacles(int[][] arrInput) {
        arr = arrInput;
        dp = new int[arr.length][arr[0].length];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                dp[i][j] = -1;
            }
        }

        return f(arr.length - 1, arr[0].length - 1);
    }
}
