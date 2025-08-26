class Solution {
    public int longestOnes(int[] arr, int k) {
        int l=0,r=0,maxlen=0,z=0;
        while(r<arr.length){
            if(arr[r]==0) z++;
            if(z>k){
                if(arr[l]==0) z--;
                l++;
            }
            if(z<=k){
                int len=r-l+1;
                maxlen=Math.max(maxlen,len);
            }
            r++;
        }
        return maxlen;
    }
}