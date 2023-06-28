class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] result = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(i -> nums[i]));
        for (int i = 0; i < nums.length; i++) {
            pq.offer(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        PriorityQueue<Integer> rq = new PriorityQueue<>(Comparator.comparingInt(i -> i));
        rq.addAll(pq);
        for (int i = 0; i < k; i++) {
            result[i] = nums[rq.poll()];
        }

        return result;
    }
}