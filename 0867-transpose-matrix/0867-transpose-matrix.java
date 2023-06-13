class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        int x = 0;
        int y = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                result[y][x] = matrix[row][col];
                y++;
            }
            y = 0;
            x++;
        }
        
        return result;
    }
}