class Solution {
    public boolean detectCapitalUse(String word) {
        boolean result = false;
        if (word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())) {
            result = true;
        } else {
            String p1 = String.valueOf(word.charAt(0));
            String p2 = word.substring(1, word.length());
            if (p1.equals(p1.toUpperCase()) && p2.equals(p2.toLowerCase())) {
                result = true;
            }
        }
        
        return result;
    }
}