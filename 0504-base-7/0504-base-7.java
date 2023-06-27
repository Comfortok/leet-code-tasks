class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        String result = "";
        int remainder;
        boolean isNegative = (num < 0) ? true : false;
        if (isNegative) num *= -1;
        
        while (num > 0) {
            remainder = num % 7;
            result += remainder;
            num /= 7;
        }
        
        if (isNegative) {
            return new StringBuffer(result).append("-").reverse().toString();
        } else {
            return new StringBuffer(result).reverse().toString();
        }
    }
}