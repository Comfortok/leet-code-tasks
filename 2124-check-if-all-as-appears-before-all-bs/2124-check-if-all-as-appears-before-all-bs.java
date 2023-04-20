class Solution {
    public boolean checkString(String s) {        
        String[] str = s.split("b");
        if (str.length > 1) {
            return false;
        }
        
        return true;
    }
}