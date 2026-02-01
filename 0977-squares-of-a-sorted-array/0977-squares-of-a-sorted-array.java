class Solution {
    public int[] sortedSquares(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int n=arr[i]*arr[i];
            arr[i]=n;
        }
        Arrays.sort(arr);
        return arr;
    }
}