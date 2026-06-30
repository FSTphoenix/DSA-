class Solution {
    public int minSubArrayLen(int tar, int[] arr) {
        int ml=Integer.MAX_VALUE,l=0,sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while(sum>=tar){
                ml=Math.min(ml,i-l+1);
                sum-=arr[l];
                l++;
            }
        }
        if(ml==Integer.MAX_VALUE) return 0;
        return ml;
    }
}