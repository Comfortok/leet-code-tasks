class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        
        for (int i = 0; i < mat.length; i++) {
            int rows = 0;
            int rowIndex = -1;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    rows++;
                    rowIndex = j;
                }
            }
            if (rows == 1) {
                int cols = 0;
                for (int k = 0; k < mat.length; k++) {
                    if (mat[k][rowIndex] == 1) {
                        cols++;
                    }
                }
                if (cols == 1) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
}