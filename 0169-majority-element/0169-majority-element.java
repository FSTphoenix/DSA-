class Solution {
    public int majorityElement(int[] nums) {
        int x = nums[0], count = 0;
        for(int i=0;i<nums.length;i++){
            if(count == 0){
                x = nums[i];
            }
            if(x == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return x;
    }
}