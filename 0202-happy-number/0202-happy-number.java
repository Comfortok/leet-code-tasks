class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        while (true) {
            if (n < 10) {
                if (sum == 0 && (n % 4 == 0 || n % 3 == 0 || n % 5 == 0)) {
                    return false;
                } else {
                    sum = sum + (n * n);
                    if (sum == 1) {
                        return true;
                    } else {
                        n = sum;
                        sum = 0;
                    }
                }
            } else {
                int a = n % 10;
                sum = sum + (a * a);
                n = n / 10;
            }
        }
    }
}