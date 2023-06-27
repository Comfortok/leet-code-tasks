class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        return Integer.toString(num, 7);
    }
}