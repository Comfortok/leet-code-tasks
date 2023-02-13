class Solution {
    public boolean isPalindrome(String str) {
        String validSymbols = "abcdefghijklmnopqrstuvwxyz0123456789";

        if (str.length() < 2) {
            return true;
        }

        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (!validSymbols.contains(String.valueOf(str.charAt(i)).toLowerCase())
                    || !validSymbols.contains(String.valueOf(str.charAt(j)).toLowerCase())) {
                if (!validSymbols.contains(String.valueOf(str.charAt(i)).toLowerCase())) {
                    i++;
                }
                if (!validSymbols.contains(String.valueOf(str.charAt(j)).toLowerCase())) {
                    j--;
                }
            } else {
                if (!String.valueOf(str.charAt(i)).equalsIgnoreCase(String.valueOf(str.charAt(j)))) {
                    return false;
                } else {
                    i++;
                    j--;
                }
            }
        }

        return true;
    }
}