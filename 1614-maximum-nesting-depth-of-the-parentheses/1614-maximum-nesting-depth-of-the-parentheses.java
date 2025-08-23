class Solution {
    public int maxDepth(String s) {
        int max=0,curr=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') curr++;
            if(curr>max) max=curr;
            else if(s.charAt(i)==')') curr--;
            
        }
        return max;
    }
}