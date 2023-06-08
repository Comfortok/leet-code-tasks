class Solution {
    public int maxDistance(int[] colors) {
        int max = 0;
        for (int i = 0; i < colors.length - 1; i++) {
            if (colors.length - 1 - i > max) {
                for (int j = colors.length - 1; j > i; j--) {
                    if (j - i > max) {
                        if (colors[i] != colors[j]) {
                            max = j - i; 
                        }
                    } else {
                        break;
                    }
                }
            } else {
                break;
            }
        }
        
        return max;
    }
}