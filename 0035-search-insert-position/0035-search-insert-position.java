class Solution {
    public int searchInsert(int[] arr, int k) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2; 
            if (arr[mid] == k) return mid;
            if (arr[mid] > k) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return i;
    }
}