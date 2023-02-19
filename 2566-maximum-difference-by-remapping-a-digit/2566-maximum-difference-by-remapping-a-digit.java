class Solution {
    public int minMaxDifference(int num) {
        String str = String.valueOf(num);
        String max = str;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '9') {
                max = str.replaceAll(String.valueOf(str.charAt(i)), "9");
                break;
            }
        }
        String min = str.replaceAll(String.valueOf(str.charAt(0)), "0");
        return Integer.parseInt(max) - Integer.parseInt(min);
    }
}