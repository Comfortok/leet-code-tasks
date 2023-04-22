class Solution {
    public boolean checkZeroOnes(String s) {
        int maxOnes = 0;
        int maxZeros = 0;
        int zeros = 0;
        int ones = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
                maxOnes = Math.max(maxOnes, ones);
                zeros = 0;
            } else {
                zeros++;
                maxZeros = Math.max(maxZeros, zeros);
                ones = 0;
            }
        }
        
        return maxOnes > maxZeros;
    }
    
}