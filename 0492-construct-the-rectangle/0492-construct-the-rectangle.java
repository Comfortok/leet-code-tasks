class Solution {
    public int[] constructRectangle(int area) {
        int a = (int) Math.sqrt(area);
        while (a > 0) {
            int b = area / a;
            if (a * b == area) {
                return new int[]{b, a};
            }
            a--;
        }
        
        return new int[0];
    }
}