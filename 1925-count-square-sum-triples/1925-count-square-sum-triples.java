class Solution {
    public int countTriples(int n) {
        int result = 0;
        if (n < 5) {
            return result;
        }

        for (int i = 1; i < n; i++) {
            double a = i * i;

            for (int j = 1; j < n; j++) {
                if (i != j) {
                    double b = j * j;
                    double c = Math.sqrt(a + b);
                    if (c > (double) n) {
                        break;
                    }

                    if (c % 1 == 0 && (int) c <= n) {
                        result++;
                    }
                }
            }
        }

        return result;
    }
}