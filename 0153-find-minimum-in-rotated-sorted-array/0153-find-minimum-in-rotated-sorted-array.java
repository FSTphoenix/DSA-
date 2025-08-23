class Solution {
    public int findMin(int[] arr) {
        int i=0,j=arr.length-1,count=Integer.MAX_VALUE;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]<count){
                count=arr[mid];
            }
            if(arr[mid]>arr[j]){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return count;
    }
}