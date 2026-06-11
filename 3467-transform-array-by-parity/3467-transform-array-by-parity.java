class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];
        int idx = 0;

        // put all evens (0)
        for(int x : nums){
            if(x % 2 == 0) ans[idx++] = 0;
        }

        // put all odds (1)
        while(idx < nums.length){
            ans[idx++] = 1;
        }

        return ans;
    }
}