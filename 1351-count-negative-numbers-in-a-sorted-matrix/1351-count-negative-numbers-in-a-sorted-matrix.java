class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int rowLength = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < rowLength; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        
        return count;
    }
}