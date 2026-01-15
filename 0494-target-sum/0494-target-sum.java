class Solution {
    static int[] arr;
    static int[][] dp;
    static int OFFSET = 1000; 

    static int f(int idx, int tar){
        if(idx < 0){
            return tar == 0 ? 1 : 0;
        }

        if(dp[idx][tar + OFFSET] != -1) 
            return dp[idx][tar + OFFSET];

        int pos = f(idx - 1, tar - arr[idx]);
        int neg = f(idx - 1, tar + arr[idx]);

        return dp[idx][tar + OFFSET] = pos + neg;
    }

    public int findTargetSumWays(int[] nums, int target) {
        arr = nums;
        dp = new int[nums.length][2001];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }

        return f(nums.length - 1, target);
    }
}
