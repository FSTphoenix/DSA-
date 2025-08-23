class Solution {
    public int singleNumber(int[] arr) {
       int run=0;
       for(int i=0;i<arr.length;i++){
           run=run^arr[i];
       }
       return run;
    }
}