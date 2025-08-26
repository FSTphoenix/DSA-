class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> Map = new HashMap<>();
        int n=s.length(),l=0,r=0,maxlen=0;
        while(r<n){
            if(Map.containsKey(s.charAt(r))){
                if(Map.get(s.charAt(r))>=l){
                    l=Map.get(s.charAt(r))+1;
                }
            }
            int len=r-l+1;
            maxlen = Math.max(maxlen, len);
            Map.put(s.charAt(r),r);
            r++;
        }
        return maxlen;
    }
}