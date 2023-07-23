class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int result = 0;
        for (int[] arr : grid) {
            Arrays.sort(arr);
        }
            
        for (int col = 0; col < grid[0].length; col++) {
            int max = 0;
            for (int row = 0; row < grid.length; row++) {
                if (grid[row][col] > grid[max][col]) {
                    max = row;
                }
            }
            result += grid[max][col];
        }
        
        return result;
    }
}