class Solution {
    public int heightChecker(int[] arr) {
        int[] ex=new int[arr.length];
        int c=0;
        for(int i=0;i<arr.length;i++){
            ex[i]=arr[i];
        }
        Arrays.sort(ex);
        for(int i=0;i<arr.length;i++){
            if(ex[i]!=arr[i]) c++; 
        }
        return c;
    }
}