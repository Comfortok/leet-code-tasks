class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        
        Map<Character, String> map = new HashMap<>();
        
        for (int i = 0; i < words.length; i++) {
            char ch = pattern.charAt(i);
            String str = words[i];
                
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(str)) {
                    return false;
                }
            } else {
                if (map.values().contains(str)) {
                    return false;
                } else {
                    map.put(ch, str);
                }
            }
        }
        
        return true;
    }
}