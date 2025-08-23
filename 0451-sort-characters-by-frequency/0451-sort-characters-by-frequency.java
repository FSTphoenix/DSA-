class Solution {
    public String frequencySort(String s) {
        StringBuilder sc=new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        char[]x=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(x[i])){
                map.put(x[i],map.get(x[i])+1);
            }
            else{
                map.put(x[i],1);
            }
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        
        for (Map.Entry<Character, Integer> entry : list) {
            char ch = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                sc.append(ch);
            }
        }
        return sc.toString();
    }
}