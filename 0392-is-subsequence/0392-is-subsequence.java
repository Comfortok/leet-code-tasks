class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int p = (index == -1) ? t.indexOf(ch) : t.indexOf(ch, index + 1);
            if (p > -1) {
                index = p;
            } else {
                return false;
            }
        }
        
        return true;
    }
}