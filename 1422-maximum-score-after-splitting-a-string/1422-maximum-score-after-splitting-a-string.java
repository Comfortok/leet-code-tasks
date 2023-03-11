class Solution {
    public int maxScore(String s) {
        int max = 0;
        int zeros = 0;
        int ones = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }
        
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1') {
                ones--;
            } else {
                zeros++;
            }
            
            max = Math.max(max, zeros + ones);
        }
        
        return max;
    }
    
}