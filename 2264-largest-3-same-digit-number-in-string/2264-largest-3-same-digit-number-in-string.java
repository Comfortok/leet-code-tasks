class Solution {
    public String largestGoodInteger(String num) {
        char a = '0';
        boolean hasDigit = false;
        for (int i = 0; i <= num.length() - 3; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                a = num.charAt(i) > a ? num.charAt(i) : a;
                hasDigit = true;
            }
        }
        
        StringBuilder result = new StringBuilder(3);
        if (hasDigit) {
            result.append(a);
            result.append(a);
            result.append(a);
        }
        
        return result.toString();
    }
}