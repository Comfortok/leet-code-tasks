class Solution {
    public int minMaxGame(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        
        Queue<Integer> queue = new LinkedList<>();
        int count = 2;
        for (int i = 1; i < nums.length; i += 2) {
            if (count % 2 == 0) {
                queue.add(Math.min(nums[i - 1], nums[i]));
            } else {
                queue.add(Math.max(nums[i - 1], nums[i]));
            }
            count++;
        }
        count = 2;
        
        while (queue.size() > 1) {
            int a = queue.poll();
            int b = queue.poll();
            if (count % 2 == 0) {
                queue.add(Math.min(a, b));
            } else {
                queue.add(Math.max(a, b));
            }
            count++;
        }
        
        return queue.poll();
    }
}