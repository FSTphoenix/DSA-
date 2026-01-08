class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];

        
        for(int j = 0; j < n; j++){
            dp[0][j] = matrix[0][j];
        }

        for(int i = 1; i < n; i++){
            for(int j = 0; j < n; j++){
                int up = dp[i-1][j];
                int ld = j > 0 ? dp[i-1][j-1] : Integer.MAX_VALUE;
                int rd = j < n-1 ? dp[i-1][j+1] : Integer.MAX_VALUE;

                dp[i][j] = matrix[i][j] + Math.min(up, Math.min(ld, rd));
            }
        }

        int ans = Integer.MAX_VALUE;
        for(int j = 0; j < n; j++) ans = Math.min(ans, dp[n-1][j]);
        return ans;
    }
}


// class Solution {
//     static int dp[][];
//     static int arr[][];

//     static int f(int i, int j){
//         if(j < 0 || j >= arr[0].length) return Integer.MAX_VALUE;
//         if(i == 0) return arr[0][j];
//         if(dp[i][j] != -1) return dp[i][j];

//         int s = f(i-1, j);
//         int ld = f(i-1, j-1);
//         int rd = f(i-1, j+1);

//         if(s != Integer.MAX_VALUE) s += arr[i][j];
//         if(ld != Integer.MAX_VALUE) ld += arr[i][j];
//         if(rd != Integer.MAX_VALUE) rd += arr[i][j];

//         return dp[i][j] = Math.min(s, Math.min(ld, rd));
//     }

//     public int minFallingPathSum(int[][] matrix) {
//         arr = matrix;
//         int n = matrix.length;

//         dp = new int[n][matrix[0].length];
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < matrix[0].length; j++){
//                 dp[i][j] = -1;
//             }
//         }

//         int sum = Integer.MAX_VALUE;
//         for(int j = 0; j < matrix[0].length; j++){
//             int x = f(n-1, j);
//             if(x < sum){
//                 sum = x;
//             }
//         }
//         return sum;
//     }
// }
