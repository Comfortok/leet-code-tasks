class Solution {
    public int minLength(String s) {
        while (s.contains("AB") || s.contains("CD")) {
            if (s.contains("AB")) {
                int index = s.indexOf("AB");
                s = s.substring(0, index) + s.substring(index + 2);
            } else {
                int index2 = s.indexOf("CD");
                s = s.substring(0, index2) + s.substring(index2 + 2);
            }
        }
        
        return s.length();
    }
}