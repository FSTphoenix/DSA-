class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Character> map=new HashMap<>();
        HashMap<Character, Character> lap=new HashMap<>();
        for(int i=0;i<s.length();i++){
           char x=s.charAt(i);
           char y=t.charAt(i);
           if(map.containsKey(x)){
                if(map.get(x)!=y) return false;
            }
            else{
                map.put(x,y);
            }
            if(lap.containsKey(y)){
                if(lap.get(y)!=x) return false;
            }
            else{
                lap.put(y,x);
            }
        }
        return true;
    }
}