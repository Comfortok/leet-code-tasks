class Solution {
    public boolean isPerfectSquare(int num) {
        long a = num;
        while (a * a > num) {
            a = (a + num / a) / 2;
        }
        
        return a * a == num;
    }
}