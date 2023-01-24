class Solution {
    public int alternateDigitSum(int n) {
        String strValue = String.valueOf(n);
        int result = ((int) strValue.charAt(0)) - 48;
        for (int i = 1; i < strValue.length(); i++) {
            int currentNum = ((int) strValue.charAt(i)) - 48;
            if (i % 2 == 0) {
                result += currentNum;
            } else {
                result -= currentNum;
            }
        }
        
        return result;
    }
}