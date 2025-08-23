class Solution {
    public boolean search(int[] arr, int k) {
        int i = 0, j = arr.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] == k) return true;
            if(arr[i]==arr[mid] && arr[j]==arr[mid]){
                i=i+1;
                j=j-1;
                continue;
            }
            if (arr[i] <= arr[mid]) {
                if (k >= arr[i] && k < arr[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            }
            else {
                if (k > arr[mid] && k <= arr[j]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
        }

        return false;
    }
}