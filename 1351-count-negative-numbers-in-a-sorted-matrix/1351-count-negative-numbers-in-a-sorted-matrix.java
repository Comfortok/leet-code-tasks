class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int rows = grid[0].length;
        int cols = grid.length;
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (grid[i][j] < 0) {
                    count = count + (rows - j);
                    break;
                }
            }
        }
        
        return count;
    }
}