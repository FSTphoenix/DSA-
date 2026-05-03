class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int smallSum = 0, largeSum = 0;

       
        for(int i = 0; i < k; i++){
            smallSum += nums[i];
        }

        
        for(int i = nums.length - 1; i >= nums.length - k; i--){
            largeSum += nums[i];
        }

        return Math.abs(largeSum - smallSum);
    }
}