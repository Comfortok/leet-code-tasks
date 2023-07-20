class Solution {
    public int addDigits(int num) {
        while (num > 9) {
            int res = 0;
            res += num % 10;
            num /= 10;
            res += num;
            num = res;
        }
        
        return num;
    }
}