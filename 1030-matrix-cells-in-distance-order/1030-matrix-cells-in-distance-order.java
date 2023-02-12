class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] coords = new int[rows * cols][];

        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                coords[count] = new int[]{i, j};
                count++;
            }
        }

        int currentIndex = -1;
        for (int i = 0; i < coords.length; i++) {
            if (coords[i][0] == rCenter && coords[i][1] == cCenter) {
                currentIndex = i;
            }
        }

        coords[0][0] = rCenter;
        coords[0][1] = cCenter;
        coords[currentIndex][0] = 0;
        coords[currentIndex][1] = 0;

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