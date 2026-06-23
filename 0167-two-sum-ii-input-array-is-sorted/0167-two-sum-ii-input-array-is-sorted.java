class Solution {
    public int[] twoSum(int[] nums, int tar) {
        int arr[]=new int[2];
        int i=0,j=nums.length-1;
        while(i<=j){
            if(nums[i]+nums[j]==tar){
                arr[0]=i+1;
                arr[1]=j+1;
                break;
            }
            if(nums[i]+nums[j]>tar) j--;
            if(nums[i]+nums[j]<tar) i++;
        }
        return arr;
    }
}