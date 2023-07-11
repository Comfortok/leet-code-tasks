class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels = "euioaEUIOA";
        int half = s.length() / 2;
        String a = s.substring(0, half);
        String b = s.substring(half, s.length());
        int ac = 0;
        int bc = 0;
        for (int i = 0; i < a.length(); i++) {
            if (vowels.indexOf(a.charAt(i)) != -1) {
                ac++;
            }
            if (vowels.indexOf(b.charAt(i)) != -1) {
                bc++;
            }
        }
        
        return ac == bc;
    }
}