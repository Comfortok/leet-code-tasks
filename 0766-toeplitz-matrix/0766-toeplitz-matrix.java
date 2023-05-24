class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix.length == 1 || matrix[0].length == 1) {
            return true;
        }
        
        for (int i = 0; i < matrix[0].length - 1; i++) {
            Set<Integer> set = new HashSet<>();
            int k = i;
            for (int j = 0; j < matrix.length; j++) {
                if (k < matrix[0].length) {
                    set.add(matrix[j][k]);
                }
                k++;
            }
            if (set.size() > 1) {
                return false;
            }
        }
        
        for (int j = 1; j < matrix.length - 1; j++) {
            Set<Integer> set = new HashSet<>();
            int k = j;
            for (int i = 0; i < matrix.length; ) {
                if (k < matrix.length && i < matrix[0].length) {
                    set.add(matrix[k][i]);
                }
                i++;
                k++;
            }
            if (set.size() > 1) {
                return false;
            }
        }
        
        return true;
    }
}