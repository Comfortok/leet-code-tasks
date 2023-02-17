class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long result = 0;
        Deque<Integer> deque = new ArrayDeque<>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        while (!deque.isEmpty()) {
            String first = deque.pollFirst().toString();
            String last = deque.isEmpty() ? "" : deque.pollLast().toString();
            result += Long.parseLong(first + last);
        }

        return result;
    }
}