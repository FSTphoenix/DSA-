class Solution {
    static boolean f(String s,String t){
        if (s.length() != t.length())
        return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) map.put(s.charAt(i), 1);
            else map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (!map.containsKey(t.charAt(i))) return false;

            map.put(t.charAt(i), map.get(t.charAt(i)) - 1);

            if (map.get(t.charAt(i)) == 0) map.remove(t.charAt(i));
        }

        return map.isEmpty();

    }
    public List<List<String>> groupAnagrams(String[] arr) {
        List<List<String>> list = new ArrayList<>();
ArrayList<String> al = new ArrayList<>();

for(int i = 0; i < arr.length; i++){
    al.add(arr[i]);
}

for(int i = 0; i < al.size(); i++){
    List<String> l = new ArrayList<>();
    l.add(al.get(i));              // add once

    for(int j = i + 1; j < al.size(); j++){
        if(f(al.get(i), al.get(j))){
            l.add(al.get(j));
            al.remove(j);          // remove by index
            j--;                   // because indices shifted
        }
    }

    al.remove(i);                  // remove current element
    i--;                           // because indices shifted

    list.add(l);
}

return list;
    }
}