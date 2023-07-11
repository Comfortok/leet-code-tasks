class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels = "euioaEUIOA";
        int half = s.length() / 2;
        String a = s.substring(0, half);
        String b = s.substring(half, s.length());
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (vowels.indexOf(a.charAt(i)) != -1) {
                count++;
            }
            if (vowels.indexOf(b.charAt(i)) != -1) {
                count--;
            }
        }
        
        return count == 0;
    }
}