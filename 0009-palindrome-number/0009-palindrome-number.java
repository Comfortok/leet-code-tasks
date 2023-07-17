class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String val = String.valueOf(x);
        int start = 0;
        int end = val.length() - 1;
        while (start <= end) {
            if (val.charAt(start) != val.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
}