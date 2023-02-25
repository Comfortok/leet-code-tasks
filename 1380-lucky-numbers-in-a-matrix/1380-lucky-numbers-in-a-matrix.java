class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < matrix.length; i++) {
            int minRow = matrix[i][0];
            int minRowIndex = 0;
            for (int j = 0; j < matrix[0].length; ) {
                if (matrix[i][j] < minRow) {
                    minRow = matrix[i][j];
                    minRowIndex = j;
                }
                j++;
                if (j == matrix[0].length) {
                    int k = 0;
                    while (k < matrix.length) {
                        if (k != i) {
                            if (matrix[i][minRowIndex] < matrix[k][minRowIndex]) {
                                k = -1;
                                break;
                            }
                        }
                        k++;
                    }
                    if (k != -1) {
                        result.add(matrix[i][minRowIndex]);
                    }
                }
            }
        }
        
        return result;
    }
}