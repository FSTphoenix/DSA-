class Solution {
    static int f(String s){
        String[] arr = s.split(" ");
        return arr.length;
    }
    public int mostWordsFound(String[] arr) {
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<f(arr[i])) max=f(arr[i]);
        }
        return max;
    }
}