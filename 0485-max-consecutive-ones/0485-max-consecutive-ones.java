class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int len=0,count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                if(count>len){
                    len=count;
                }
                count=0;
            }
            else count++;
        }
        if(count>len) len =count;
        return len;
    }
}