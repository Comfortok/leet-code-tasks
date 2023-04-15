class Solution {
    public boolean checkValid(int[][] matrix) {
        if (matrix.length != matrix[0].length) {
            return false;
        }
        
        for (int i = 0; i < matrix.length; i++) {
            int[] validNums = new int[matrix.length];
            for (int j = 0; j < matrix[0].length; j++) {
                int num = matrix[i][j];
                if (num < 1 || num > matrix.length) {
                    return false;
                } else {
                    if (i == 0) {
                        int[] valids = new int[matrix.length];
                        for (int k = 0; k < matrix.length; k++) {
                            int e = matrix[k][j];
                            if (e < 1 || e > matrix.length) {
                                return false;
                            } else {
                                if (valids[e - 1] == 0) {
                                    valids[e - 1] = e;
                                } else {
                                    return false;
                                }
                            }
                        }
                    }
                    
                    if (validNums[num - 1] == 0) {
                        validNums[num - 1] = num;
                    } else {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}