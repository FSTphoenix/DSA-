class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int l = arr.length - 1;

        for(int i = 0; i <= l; i++){
            if(arr[i] % 2 != 0){
                int temp = arr[i];
                arr[i] = arr[l];
                arr[l] = temp;
                l--;
                i--; 
            }
        }
        return arr;
    }
}