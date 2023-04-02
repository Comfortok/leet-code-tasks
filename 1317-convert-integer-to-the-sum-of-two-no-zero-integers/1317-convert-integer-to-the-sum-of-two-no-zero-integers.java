class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; ) {
            if (!String.valueOf(i).contains("0")) {
                int a = n - i;
                if (!String.valueOf(a).contains("0")) {
                    return new int[]{i, a};
                }
            }
            
            i = increment(i);
        }
        
        return new int[]{};
    }
    
    private int increment(int i) {
        if (i % 100 == 0) {
            i += 11;
        } else if (i % 1000 == 0) {
            i += 111;
        } else if (i % 10000 == 0) {
            i += 1111;
        } else {
            i++;
        }
        
        return i;
    }
}