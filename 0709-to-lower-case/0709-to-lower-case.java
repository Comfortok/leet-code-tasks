class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(String.valueOf(s.charAt(i)).toLowerCase());
        }
        
        return sb.toString();
    }
}