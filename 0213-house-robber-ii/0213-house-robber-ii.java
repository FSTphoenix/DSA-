class Solution {
    static int[] dp;

    static int f(int n, int[] nums){
        if(n == 0) return nums[n];
        if(n < 0) return 0;
        if(dp[n] != -1) return dp[n];

        int pick = nums[n] + f(n-2, nums);
        int notPick = f(n-1, nums);

        return dp[n] = Math.max(pick, notPick);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        int[] arr1 = new int[n-1];
        int[] arr2 = new int[n-1];

        for(int i = 0; i < n-1; i++){
            arr1[i] = nums[i];       
            arr2[i] = nums[i+1];     
        }

        dp = new int[n-1];
        Arrays.fill(dp, -1);
        int ans1 = f(arr1.length - 1, arr1);

        dp = new int[n-1];
        Arrays.fill(dp, -1);
        int ans2 = f(arr2.length - 1, arr2);

        return Math.max(ans1, ans2);
    }
}
