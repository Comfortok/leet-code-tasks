class Solution {
    public int addDigits(int num) {
        int res = num;
        while (num > 9) {
            res = 0;
            res += num % 10;
            num /= 10;
            res += num;
            num = res;
        }
        
        return num;
    }
}