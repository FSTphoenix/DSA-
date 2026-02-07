class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] arr=new String[words.length];
        for(int i=0;i<arr.length;i++){
            String x=words[i];
            char ch=x.charAt(x.length()-1);
            int num = Character.getNumericValue(ch);
            x = x.substring(0, x.length() - 1);
            arr[num-1]=x;
        }
        String sen = String.join(" ", arr);
        return sen;
    }
}