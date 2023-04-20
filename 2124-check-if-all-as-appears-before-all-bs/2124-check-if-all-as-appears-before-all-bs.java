class Solution {
    public boolean checkString(String s) {
        if (s.lastIndexOf("a") < s.indexOf("b") || s.indexOf("b") == -1) {
            return true;
        } else {
            return false;
        }
    }
}