class Solution {
    public int secondHighest(String s) {
        int max = -1;
        for (int i = 9; i >= 0; i--) {
            if (s.indexOf(String.valueOf(i)) != -1) {
                if (max != -1) {
                    return i;
                } else {
                    max = i;
                }
            }
        }
        
        return -1;
    }
}