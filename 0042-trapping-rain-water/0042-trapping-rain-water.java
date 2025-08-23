class Solution {
    public int trap(int[] arr) {
        int Lmax = 0, Rmax = 0, total = 0;
        int l = 0, r = arr.length - 1;

        while (l < r) {
            if (arr[l] <= arr[r]) {
                if (Lmax > arr[l]) {
                    total += Lmax - arr[l];
                } else {
                    Lmax = arr[l];
                }
                l++; 
            } else {
                if (Rmax > arr[r]) {
                    total += Rmax - arr[r];
                } else {
                    Rmax = arr[r];
                }
                r--; 
            }
        }
        return total;
    }
}
