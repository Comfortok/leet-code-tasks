class Solution {
    public int[] constructRectangle(int area) {
        int a = (int) Math.sqrt(area);
        int b = a;
        while (a > 0 && b <= area) {
            if (a * b == area) {
                return new int[]{b, a};
            } else if (a * b > area) {
                a--;
            } else {
                b++;
            }
        }
        
        return new int[0];
    }
}