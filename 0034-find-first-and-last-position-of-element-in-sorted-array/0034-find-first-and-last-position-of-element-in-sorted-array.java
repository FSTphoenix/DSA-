class Solution {
    public int[] searchRange(int[] arr, int k) {
        int[] nums = new int[2];
        nums[0] = -1;
        nums[1] = -1;
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] == k) {
                nums[0] = mid;
                j = mid - 1; 
            } else if (arr[mid] < k) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        i = 0;
        j = arr.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] == k) {
                nums[1] = mid;
                i = mid + 1; 
            } else if (arr[mid] < k) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return nums;
    }
}
