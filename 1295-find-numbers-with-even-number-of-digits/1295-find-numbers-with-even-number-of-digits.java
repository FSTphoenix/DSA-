class Solution {
    static int f(int x){
        int count=0;
        while(x!=0){
            count++;
            x=x/10;
        }
        return count;
    }
    public int findNumbers(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(f(arr[i])%2==0) count++;
        }
        return count;
    }
}