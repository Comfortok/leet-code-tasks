class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int result = 0;
        for (int[] arr : grid) {
            Arrays.sort(arr);
        }
            
        for (int col = 0; col < grid[0].length; col++) {
            int max = 0;
            for (int row = 0; row < grid.length; row++) {
                max = Math.max(max, grid[row][col]);
            }
            
            result += max;
        }
        
        return result;
    }
}