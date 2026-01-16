class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()) return false;
        if(s.length()==0) return true;
        int n=t.length();
        int m=s.length();
        int i=0,j=0;
        while(n!=0 && m!=0){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
                m--;
                if(m==0) return true;
            }
            else j++;
            n--;
        }
        return false;
    }
}