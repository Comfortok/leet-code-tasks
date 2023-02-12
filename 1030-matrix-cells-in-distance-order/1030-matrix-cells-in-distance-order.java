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

        Arrays.sort(coords, (a, b) -> Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter)
                - Math.abs(b[0] - rCenter) - Math.abs(b[1] - cCenter));

        return coords;
    }
}