class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;
        int mid = s.length() / 2;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < mid; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
            if (vowels.indexOf(s.charAt(i + mid)) != -1) {
                count--;
            }
        }
        
        return count == 0;
    }
}