class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (i < 2) {
                list.add(i);
            } else {
                list.add(list.get(i - 1) + list.get(i - 2));
            }
        }
        
        return list.get(n);
    }
}