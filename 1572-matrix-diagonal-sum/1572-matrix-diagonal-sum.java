class Solution {
    public int diagonalSum(int[][] mat) {
        if (mat.length == 1) {
            return mat[0][0];
        }
        
        int sum = 0;
        int topLeft = 0;
        int topRight = mat[0].length - 1;
        while (topLeft < mat[0].length && topRight >= 0) {
            if (topLeft == topRight) {
                sum += mat[topLeft][topLeft];
            } else {
                sum += (mat[topLeft][topLeft] + mat[topLeft][topRight]);
            }
            topLeft++;
            topRight--;
        }
        
        return sum;
    }
}