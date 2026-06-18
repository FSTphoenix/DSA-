class Solution {
    public double findMaxAverage(int[] arr, int k) {
        if(arr.length<=k){
            double sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
            }
            return sum/arr.length;
        }
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        double msum=sum / k;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            msum=Math.max(sum/k,msum);
        }
        return msum;
    }
}