class Solution {
    
    public int distinctIntegers(int n) {
        return (n - 1 > 1) ? n - 1 : 1;
        // return Math.max(n - 1, 1);
    }
    
}