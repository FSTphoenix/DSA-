class Solution {
    static int dp[][][];
    static int arr[];

    static int f(int idx, int buy, int cap){
        if(idx == arr.length) return 0;
        if(cap == 0) return 0;

        if(dp[idx][buy][cap] != -1) return dp[idx][buy][cap];

        int profit;

        if(buy == 1){
            profit = Math.max(
                    -arr[idx] + f(idx+1, 0, cap),
                    f(idx+1, 1, cap)
            );
        } else {
            profit = Math.max(
                    arr[idx] + f(idx+1, 1, cap-1),
                    f(idx+1, 0, cap)
            );
        }

        return dp[idx][buy][cap] = profit;
    }

    public int maxProfit(int t, int[] prices) {
    arr = prices;
    int n = arr.length;
    dp = new int[n][2][t+1];

    for(int i=0;i<n;i++)
        for(int j=0;j<2;j++)
            for(int k=0;k<=t;k++)
                dp[i][j][k] = -1;

    return f(0, 1, t);
}

}