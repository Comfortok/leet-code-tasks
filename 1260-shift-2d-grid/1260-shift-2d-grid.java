class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        k = k % (m * n);
        while (k > 0) {
            int a = grid[m - 1][n - 1];
            Integer temp = null;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (temp == null) {
                        temp = grid[i][j + 1];
                        grid[i][j + 1] = grid[i][j];
                    } else {
                        int temp2 = grid[i][j + 1];
                        grid[i][j + 1] = temp;
                        temp = temp2;
                    }
                }

                if (i + 1 == m) {
                    grid[0][0] = a;
                } else {
                    if (temp == null) {
                        temp = grid[i + 1][0];
                        grid[i + 1][0] = grid[i][n - 1];
                    } else {
                        int temp3 = grid[i + 1][0];
                        grid[i + 1][0] = temp;
                        temp = temp3;
                    }
                }
            }

            k--;
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> list1 = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list1.add(grid[i][j]);
            }
            result.add(list1);
        }

        return result;
    }
    
    public List<List<Integer>> shiftGrid2(int[][] g, int k) {
        int m = g.length, n = g[0].length, tot = m * n;
        List<List<Integer>> res= new ArrayList<>();
        k = k % tot;
        for (int i = 0; i < m; i++) res.add(new ArrayList<>());
        for (int l = 0; l < tot; l++) {
            int idx = (l - k + tot) % tot;
            res.get(l / n).add(g[idx / n][idx % n]);
        }
        return res;
    }
}