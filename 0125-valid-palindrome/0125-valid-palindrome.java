class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder(s.trim().toLowerCase());
        String validSymbols = "abcdefghijklmnopqrstuvwxyz0123456789";

        for (int a = 0; a < str.length(); ) {
            if (!validSymbols.contains(String.valueOf(str.charAt(a)))) {
                str.deleteCharAt(a);
            } else {
                a++;
            }
        }

        if (str.length() < 2) {
            return true;
        }

        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (!validSymbols.contains(String.valueOf(str.charAt(i))) || !validSymbols.contains(String.valueOf(str.charAt(j)))) {
                if (!validSymbols.contains(String.valueOf(str.charAt(i)))) {
                    str.deleteCharAt(i);
                    j--;
                } else if (!validSymbols.contains(String.valueOf(str.charAt(j)))) {
                    str.deleteCharAt(j);
                    j--;
                }
            } else {
                if (str.charAt(i) != str.charAt(j)) {
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