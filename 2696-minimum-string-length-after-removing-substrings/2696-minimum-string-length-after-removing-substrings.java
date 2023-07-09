class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.indexOf("AB") != -1 || sb.indexOf("CD") != -1) {
            int a = sb.indexOf("AB");
            if (a != -1) sb.delete(a, a + 2);
            int b = sb.indexOf("CD");
            if (b != -1) sb.delete(b, b + 2);
        }
        
        return sb.toString().length();
    }
}