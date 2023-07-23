class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int row = 0; row < grid.length; row++) {
            int[] arr = new int[grid[0].length];
            int ind = 0;
            for (int col = 0; col < grid[0].length; col++) {
                arr[ind] = grid[row][col];
                ind++;
            }
            Arrays.sort(arr);
            grid[row] = arr;
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