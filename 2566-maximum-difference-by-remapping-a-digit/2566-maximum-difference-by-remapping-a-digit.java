class Solution {
    public int minMaxDifference(int num) {
        String str = String.valueOf(num);
        int max = num;
        int multiplier = str.length() - 1;
        int first = -1;
        boolean firstFound = false;
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i) - '0';
            if (a != 9 && !firstFound) {
                first = a;
                firstFound = true;
            }

            if (first == a) {
                int b = 9 - first;
                max += b * Math.pow(10, multiplier);
            }
            multiplier--;
        }
        String min = str.replaceAll(String.valueOf(str.charAt(0)), "0");

        return max - Integer.parseInt(min);
    }
}