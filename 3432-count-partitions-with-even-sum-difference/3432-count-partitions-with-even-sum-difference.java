class Solution {
    public int countPartitions(int[] nums) {

        int[] arr = new int[nums.length];
        arr[0] = nums[0];

        for(int i = 1; i < nums.length; i++) {
            arr[i] = arr[i - 1] + nums[i];
        }

        int count = 0,i = 0;
        while(i < nums.length - 1) {

            int left = arr[i];
            int right = arr[nums.length - 1] - arr[i];

            if((left - right) % 2 == 0) {
                count++;
            }

            i++;
        }

        return count;
    }
}