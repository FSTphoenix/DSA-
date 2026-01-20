class Solution {
    static int dp[][];
    static int arr[];
    
    static int f(int idx, int tar){
        if(idx == 0){
            if(tar % arr[0] == 0) return 1;
            else return 0;
        }

        if(dp[idx][tar] != -1) return dp[idx][tar];

        int nt = f(idx - 1, tar);  
        int t = 0;

        if(arr[idx] <= tar){
            t = f(idx, tar - arr[idx]); 
        }

        return dp[idx][tar] = t + nt;
    }

    public int change(int amount, int[] coins) {
        arr = coins;
        dp = new int[coins.length][amount + 1];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        
        return f(coins.length - 1, amount);
    }
}
