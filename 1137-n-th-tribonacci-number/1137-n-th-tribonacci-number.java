class Solution {
    public int tribonacci(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (i < 2) {
                list.add(i);
            } else if (i == 2) {
                list.add(1);
            } else {
                list.add(list.get(i - 1) + list.get(i - 2) + list.get(i - 3));
            }
        }

        return list.get(n);
    }
}