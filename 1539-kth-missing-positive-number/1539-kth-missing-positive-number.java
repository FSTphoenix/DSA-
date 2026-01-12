class Solution {
    public int findKthPositive(int[] arr, int k) {

        
        if (arr[0] > 1) {
            if (k <= arr[0] - 1) return k;
            k -= (arr[0] - 1);
        }

       
        for (int i = 1; i < arr.length; i++) {
            int missing = arr[i] - arr[i - 1] - 1;

            if (k <= missing) {
                return arr[i - 1] + k;
            }
            k -= missing;
        }

        
        return arr[arr.length - 1] + k;
    }
}
