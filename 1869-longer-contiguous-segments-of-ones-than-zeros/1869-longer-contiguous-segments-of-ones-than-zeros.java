class Solution {
    public boolean checkZeroOnes(String s) {
        String[] ones = s.split("0");
        String[] zeros = s.split("1");
        int lOnes = getMaxLength(ones);
        int lZeros = getMaxLength(zeros);
        return lOnes > lZeros;
    }
    
    private int getMaxLength(String[] arr) {
        int max = 0;
        for (String str : arr) {
            if (str.length() > max) {
                max = str.length();
            }
        }
        
        return max;
    }
}