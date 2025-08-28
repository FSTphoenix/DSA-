import java.util.HashMap;

class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0, maxlen = 0, maxfreq = 0;

        while (r < s.length()) {
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxfreq = Math.max(maxfreq, map.get(c));
            while ((r - l + 1) - maxfreq > k) {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                l++;
            }
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }

        return maxlen;
    }
}
