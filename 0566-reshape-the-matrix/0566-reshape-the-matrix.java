class Solution {
    public int[][] matrixReshape(int[][] matrix, int r, int c) {
        if (matrix[0].length * matrix.length != r * c) {
            return matrix;
        }

        int[][] result = new int[r][c];
        int a = 0;
        int b = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[a][b] = matrix[i][j];
                b++;
                if (b == c) {
                    b = 0;
                    a++;
                }
            }
        }
        
        
        return result;
    }
}