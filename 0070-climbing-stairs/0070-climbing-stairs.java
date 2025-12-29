class Solution {
    static int dp[];

    static int idx(int n) {
        if (n <= 1)
            return 1;
        if (dp[n] != -1)
            return dp[n];

        return dp[n] = idx(n - 1) + idx(n - 2);
    }

    public int climbStairs(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return idx(n);
    }
}