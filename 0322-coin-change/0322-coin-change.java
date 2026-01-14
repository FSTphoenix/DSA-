class Solution {
    static int[] arr;

    static int f(int idx, int tar){
        if(idx == 0){
            if(tar % arr[0] == 0) return tar / arr[0];
            else return Integer.MAX_VALUE;
        }

        int nt = f(idx - 1, tar);  
        int t = Integer.MAX_VALUE;

        if(arr[idx] <= tar){
            int res = f(idx, tar - arr[idx]); 
            if(res != Integer.MAX_VALUE)
                t = 1 + res;
        }

        return Math.min(nt, t);
    }

    public int coinChange(int[] coins, int amount) {
        arr = coins;
        int ans = f(coins.length - 1, amount);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
