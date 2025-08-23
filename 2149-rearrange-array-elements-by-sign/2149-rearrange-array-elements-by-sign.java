class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[]=new int[nums.length];
        int j=0,z=arr.length/2;
        for(int i=0;i<arr.length;i++){
            if(nums[i]>0){
                arr[j]=nums[i];
                j++;
            }
            if(nums[i]<0){
                arr[z]=nums[i];
                z++;
            }
        }
        j=0;
        z=arr.length/2;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                nums[i]=arr[j];
                j++;
            }
            else{
                nums[i]=arr[z];
                z++;
            }
        }
        return nums;
    }
}