class Solution {
    public boolean checkString(String s) {
        if (!s.contains("a") || !s.contains("b")) {
            return true;
        }
        
        String[] str = s.split("b");
        if (str.length > 1) {
            return false;
        }
        
        return true;
    }
}