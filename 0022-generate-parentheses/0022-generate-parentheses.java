class Solution {
    static void gp(int n,int open,int close,List<String> ans,String str ){
        if(open==n && close==n){
            ans.add(str);
        }
        if(open<n) gp(n,open+1,close,ans,str+"(");
        if(close<open) gp(n,open,close+1,ans,str+")");
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        String str="";
        gp(n,0,0,ans,str);
        return ans;
    }
}