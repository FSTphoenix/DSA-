class Solution {
    public String longestCommonPrefix(String[] arr) {
        StringBuilder sc=new StringBuilder();
        Arrays.sort(arr);
        String x=arr[0],y=arr[arr.length-1];
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)==y.charAt(i)){
                sc.append(x.charAt(i));
            }
            else break;
        }
        String z= sc.toString();
        return z;
    }
}