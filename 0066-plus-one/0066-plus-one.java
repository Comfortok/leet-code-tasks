class Solution {
    public int[] plusOne(int[] digits) {
        int temp = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + temp != 10) {
                digits[i] = digits[i] + 1;
                temp = 0;
                break;
            } else {
                digits[i] = 0;
            }
        }
        
        if (temp == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = temp;
            for (int i = 0; i < digits.length; i++) {
                result[i + 1] = digits[i];
            }
            return result;
        }
        
        return digits;
    }
}