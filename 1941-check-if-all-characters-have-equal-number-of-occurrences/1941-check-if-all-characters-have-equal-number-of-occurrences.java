class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        
        int count = 0;
        for (int value : table) {
            if (count == 0) {
                count = value;
            } else if (value != 0 && value != count) {
                return false;
            }
        }
        
        return true;
    }
}