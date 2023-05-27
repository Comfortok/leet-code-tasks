class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        int count = 0;
        for (int value : map.values()) {
            if (count == 0) {
                count = value;
            } else if (value != count) {
                return false;
            }
        }
        
        return true;
    }
}