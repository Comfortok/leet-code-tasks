class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        int[][] matrix = new int[rowIndex + 1][rowIndex + 1];
        int m = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || i == 1 || j == 0 || j == m) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
                }
            }
            m++;
        }

        for (int i = 0; i <= rowIndex; i++) {
            result.add(matrix[rowIndex][i]);
        }

        return result;
    }
}