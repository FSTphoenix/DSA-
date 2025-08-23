class Solution {
    static String values(String s){
        if(s.equals("2")) return "abc";
        if(s.equals("3")) return "def";
        if(s.equals("4")) return "ghi";
        if(s.equals("5")) return "jkl";
        if(s.equals("6")) return "mno";
        if(s.equals("7")) return "pqrs";
        if(s.equals("8")) return "tuv";
        if(s.equals("9")) return "wxyz";
        return"";
    }
    static void combi(String digit,String str,int idx,List<String> result){
        if(str.length()==digit.length()){
            result.add(str);
            return;
        }
        if(idx==digit.length()) return;
        String ch = String.valueOf(digit.charAt(idx));
        String val=values(ch);
        for(int i=0;i<val.length();i++){
            combi(digit,str+val.charAt(i),idx+1,result);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0) return result;
        combi(digits,"",0,result);
        return result;
    }
}