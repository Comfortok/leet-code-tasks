class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            map.put(ch1, map.getOrDefault(ch1, 0) + 1);
            char ch2 = t.charAt(i);
            if (map.containsKey(ch2)) {
                map.put(ch2, map.get(ch2) - 1);
            } else {
                map.put(ch2, -1);
            }
        }
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        
        return true;
    }
}