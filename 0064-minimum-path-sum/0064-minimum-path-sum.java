class Solution {
    static int dp[][];
    static int arr[][];

    static int f(int i, int j){
        if(i == 0 && j == 0) return arr[i][j];
        if(i < 0 || j < 0) return Integer.MAX_VALUE;
        if(dp[i][j] != -1) return dp[i][j];

        int up =f(i-1, j);
        int left =f(i, j-1);
        
        if(up!=Integer.MAX_VALUE) up+=arr[i][j];
        if(left!=Integer.MAX_VALUE) left+=arr[i][j];

        return dp[i][j] = Math.min(up, left);
    }

    public int minPathSum(int[][] grid) {
        arr = grid;
        dp = new int[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                dp[i][j] = -1;
            }
        }

        return f(grid.length - 1, grid[0].length - 1);
    }
}
