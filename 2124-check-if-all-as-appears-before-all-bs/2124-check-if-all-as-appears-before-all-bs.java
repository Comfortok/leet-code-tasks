class Solution {
    public boolean checkString(String s) {
        if (s.lastIndexOf("ba") != -1) {
            return false;
        }
        
        return true;
    }
}