class Solution {
    public int heightChecker(int[] heights) {
        int[] actual = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            actual[i] = heights[i];
        }
        Arrays.sort(heights);
        int result = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != actual[i]) {
                result++;
            }
        }
        
        return result;
    }
}