class Solution {
    static int dp[][];
    static int arr[];

    static int f(int idx, int buy){
        if(idx == arr.length) return 0;

        if(dp[idx][buy] != -1) return dp[idx][buy];

        int profit;

        if(buy == 1){
            profit = Math.max(
                    -arr[idx] + f(idx+1, 0),  
                    f(idx+1, 1)               
            );
        } else {
            profit = Math.max(
                    arr[idx] + f(idx+1, 1),   
                    f(idx+1, 0)               
            );
        }

        return dp[idx][buy] = profit;
    }

    public int maxProfit(int[] prices) {
        arr = prices;
        dp = new int[arr.length][2];

        for(int i=0;i<arr.length;i++)
            for(int j=0;j<2;j++)
                dp[i][j] = -1;

        return f(0, 1);
    }
}
