class Solution {
    public int maxProfit(int[] arr) {
        int profit=0,sell=0;
        for(int i=arr.length-1;i>=0;i--){
            if(sell<arr[i]){
                sell=arr[i];
            }
            if(arr[i]<sell){
                int x=sell-arr[i];
                if(profit<x){
                    profit=x;
                }
            }
        }
        return profit;
    }
}