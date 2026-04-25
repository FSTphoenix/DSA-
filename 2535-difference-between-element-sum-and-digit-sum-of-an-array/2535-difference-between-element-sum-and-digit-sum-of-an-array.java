class Solution {
    static int f(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int differenceOfSum(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            sum-=f(arr[i]);
        }
        return sum;

    }
}