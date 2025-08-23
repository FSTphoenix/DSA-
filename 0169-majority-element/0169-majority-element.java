class Solution {
    public int majorityElement(int[] arr) {
        int x=arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                x=arr[i];
                count=0;
            }
            if(arr[i]==x){
                count++;
            }
            else count--;
        }
        return x;
    }
}