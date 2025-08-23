class Solution {
    public int maxSubArray(int[] arr) {
        int sum=0,maxsum=Integer.MIN_VALUE,i=0;
        while(i<arr.length){
            sum=sum+arr[i];
            if(maxsum<sum){
                maxsum=sum;
            }
            if(sum<0){
                sum=0;
            }
            i++;
        }
        return maxsum;
    }
}