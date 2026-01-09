class Solution {
    static int[] arr;
    static int[][] dp;

    static boolean f(int idx, int tar){
        if(tar == 0) return true;
        if(idx == 0) return arr[0] == tar;

        if(dp[idx][tar] != -1) 
            return dp[idx][tar] == 1;

        boolean nt = f(idx - 1, tar);
        boolean t = false;

        if(tar >= arr[idx]){
            t = f(idx - 1, tar - arr[idx]);
        }

        dp[idx][tar] = (nt || t) ? 1 : 0;
        return nt || t;
    }

    public boolean canPartition(int[] nums) {
        arr = nums;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        if(sum % 2 != 0) return false;

        int target = sum / 2;
        dp = new int[arr.length][target + 1];

        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        return f(arr.length - 1, target);
    }
}
