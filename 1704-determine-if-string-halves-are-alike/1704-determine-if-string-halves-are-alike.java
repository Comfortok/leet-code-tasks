class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels = "euioaEUIOA";
        char[] arr = s.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (vowels.indexOf(arr[i]) != -1) {
                if (i < arr.length / 2) count++;
                else count--;
            }
        }
        
        return count == 0;
    }
}