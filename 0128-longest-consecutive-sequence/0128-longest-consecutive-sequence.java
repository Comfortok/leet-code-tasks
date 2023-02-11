class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int result = 0;

        for (Integer num : set) {
            if (!set.contains(num - 1)) {
                int current = num + 1;

                while (set.contains(current)) {
                    current++;
                }

                result = Math.max(result, current - num);
            }
        }

        return result;
    }
}