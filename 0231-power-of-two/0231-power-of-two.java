class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        } else {
            if (n == 0) {
                return false;
            }
        }
        
        int result = getDivide(n);
        if (result == 0 || result == 1) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public int getDivide(int n) {
        if (n % 2 != 0) {
            return n;
        }
        
        return getDivide(n / 2);
    }
}