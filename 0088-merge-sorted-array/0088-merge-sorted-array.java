class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            list.add(nums1[i]);
        }

        int i = 0, j = 0, idx = 0;

        while(i < m && j < n) {
            if(list.get(i) <= nums2[j]) {
                nums1[idx++] = list.get(i++);
            } else {
                nums1[idx++] = nums2[j++];
            }
        }

        while(i < m) {
            nums1[idx++] = list.get(i++);
        }

        while(j < n) {
            nums1[idx++] = nums2[j++];
        }
    }
}