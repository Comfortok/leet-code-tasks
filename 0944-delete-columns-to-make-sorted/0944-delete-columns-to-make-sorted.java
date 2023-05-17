class Solution {
    public int minDeletionSize(String[] strs) {        
        int result = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            char prev = '0';
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) < prev) {
                    result++;
                    break;
                }
                prev = strs[j].charAt(i);
            }
        }
        
        return result;
    }
}