class Solution {
    public int maxScore(String s) {
        int max = 0;
        for (int i = 1; i < s.length(); i++) {
            String s1 = s.substring(0, i);
            String s2 = s.substring(i, s.length());
            int sum = getNumCount(s1, '0') + getNumCount(s2, '1');
            if (sum > max) {
                max = sum;
            }
        }
        
        return max;
    }
    
    private int getNumCount(String s, char num) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == num) {
                count++;
            }
        }
        
        return count;
    }
}