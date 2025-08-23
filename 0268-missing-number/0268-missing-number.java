class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int j=arr.length;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=j){
                return j;
            }
            j--;
        }
        return 0;
    }
}