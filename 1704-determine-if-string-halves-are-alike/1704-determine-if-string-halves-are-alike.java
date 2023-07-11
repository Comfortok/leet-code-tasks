class Solution {
    public boolean halvesAreAlike(String s) {
        char[] arr = s.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isVowel(arr[i])) {
                if (i < arr.length / 2) count++;
                else count--;
            }
        }
        
        return count == 0;
    }
    
    private boolean isVowel(char ch) {
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
            ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
    }
}