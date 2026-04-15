class Solution {
    public String restoreString(String s, int[] arr) {
        char[] arr1 = new char[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[arr[i]]=s.charAt(i);
        }
        String str = new String(arr1);
        return str;

    }
}