class Solution {
    public boolean checkIfPangram(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), 1);
        }

        return map.size() == 26;
    }
}