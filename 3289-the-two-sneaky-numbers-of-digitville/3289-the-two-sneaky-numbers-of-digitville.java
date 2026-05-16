class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq = new int[101];
        int[] ans = new int[2];
        int idx = 0;

        for(int x : nums){
            freq[x]++;

            if(freq[x] == 2){
                ans[idx++] = x;
            }
        }

        return ans;
    }
}