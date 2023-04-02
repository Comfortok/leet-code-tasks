class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            if (!String.valueOf(i).contains("0")) {
                int a = n - i;
                if (!String.valueOf(a).contains("0")) {
                    return new int[]{i, a};
                }
            }
        }
        
        return new int[]{};
    }
}