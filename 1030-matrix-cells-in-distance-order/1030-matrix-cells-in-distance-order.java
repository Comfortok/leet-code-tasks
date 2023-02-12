class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] coords = new int[rows * cols][];
        coords[0] = new int[]{rCenter, cCenter};

        int count = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (coords[0][0] != i || coords[0][1] != j) {
                    coords[count] = new int[]{i, j};
                    count++;
                }
            }
        }

        for (int i = 1; i < coords.length - 1; i++) {
            for (int j = i + 1; j < coords.length; j++) {
                int distance1 = Math.abs(rCenter - coords[i][0]) + Math.abs(cCenter - coords[i][1]);
                int distance2 = Math.abs(rCenter - coords[j][0]) + Math.abs(cCenter - coords[j][1]);
                if (distance2 < distance1) {
                    int[] temp = coords[i];
                    coords[i] = coords[j];
                    coords[j] = temp;
                }
            }
        }

        return coords;
    }
}