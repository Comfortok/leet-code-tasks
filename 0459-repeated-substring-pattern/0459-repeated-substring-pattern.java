class Solution {
    public boolean repeatedSubstringPattern(String s) {
        boolean result = false;
        for (int i = 1; i <= s.length() / 2; i++) {
            if (result == true) {
                return result;
            }
            String sub = s.substring(0, i);
            result = getResult(s, sub);
        }
        
        return result;
    }
    
    private boolean getResult(String str, String sub) {
        if (str.equals(sub)) {
            return true;
        }
        
        if (str.startsWith(sub)) {
            str = str.substring(sub.length());
            return getResult(str, sub);
        } else {
            return false;
        }
    }
}