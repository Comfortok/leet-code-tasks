class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> deque = new ArrayDeque<>();
        int result = 0;
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];
            switch (op) {
                case "+": {
                    Integer a = deque.pollLast();
                    Integer b = deque.peekLast();
                    deque.add(a);
                    deque.add(a + b);
                    break;
                }
                case "D": {
                    deque.add(deque.peekLast() * 2);
                    break;
                }
                case "C": {
                    deque.pollLast();
                    break;
                }
                default: {
                    deque.add(Integer.valueOf(op));
                    break;
                }
            }
        }
        
        for (Integer num : deque) {
            result += num;
        }
        
        return result;
    }
}