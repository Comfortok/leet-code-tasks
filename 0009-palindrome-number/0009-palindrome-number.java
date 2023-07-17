class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        int init = x;
        int res = 0;
        while (init > 9) {
            int d = init % 10;
            init = init / 10;
            res = (res * 10) + d;
        }
        
        res = (res * 10) + init;
        
        return res == x;
    }
}