class Solution {
    public int secondHighest(String s) {
        String[] digits = s.split("[a-z]");
        int[] allDigits = new int[10];
        int max = -1;
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits[i].length(); j++) {
                int index = (digits[i].charAt(j) - '0');
                allDigits[index] = 1;
            }
        }
        
        for (int i = 9; i >= 0; i--) {
            if (allDigits[i] != 0) {
                if (max != -1) {
                    return i;
                } else {
                    max = i;
                }
            }
        }
        
        return -1;
    }
}