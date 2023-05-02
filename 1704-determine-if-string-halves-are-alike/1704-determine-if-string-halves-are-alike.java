class Solution {
    public boolean halvesAreAlike(String s) {
        int a = 0;
        int b = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(String.valueOf(s.charAt(i)))) {
                if (i < s.length() / 2) {
                    a++;
                } else {
                    b++;
                }
            }
        }
        
        return a == b;
    }
}