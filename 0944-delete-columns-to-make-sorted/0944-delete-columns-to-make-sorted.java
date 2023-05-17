class Solution {
    public int minDeletionSize(String[] strs) {        
        int result = 0;
        int n = strs.length;
        int l = strs[0].length();
        
        for (int i = 0; i < l; i++) {
            char prev = strs[0].charAt(i);
            for (int j = 1; j < n; j++) {
                char cur = strs[j].charAt(i);
                if (cur < prev) {
                    result++;
                    break;
                }
                prev = cur;
            }
        }
        
        return result;
    }
}