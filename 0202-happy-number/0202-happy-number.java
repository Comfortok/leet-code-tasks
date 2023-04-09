class Solution {
    public boolean isHappy(int n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        while (!sb.toString().equals("1")) {
            if (Integer.parseInt(sb.toString()) <= 4) {
                return false;
            }
            int sum = 0;
            for (int i = 0; i < sb.length(); i++) {
                int a = sb.charAt(i) - '0';
                sum += (a * a);
            }
            sb = new StringBuilder(String.valueOf(sum));
        }

        return true;
    }
}