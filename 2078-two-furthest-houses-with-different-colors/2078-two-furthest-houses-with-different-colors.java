class Solution {
    public int maxDistance(int[] colors) {
        int max = 0;
        for (int i = 0; i < colors.length - 1; i++) {
            for (int j = colors.length - 1; j > i; j--) {
                if (j - i > max) {
                    if (colors[i] != colors[j]) {
                        max = j - i; 
                    }
                } else {
                    break;
                }
            }
        }
        
        return max;
    }
}