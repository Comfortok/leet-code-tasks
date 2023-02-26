class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int streak = 0;
        if (nums.length == 1) {
            result.add(String.valueOf(nums[0]));
            return result;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                streak++;
            } else {
                if (streak == 0) {
                    result.add(String.valueOf(nums[i]));
                } else {
                    result.add(nums[i - streak] + "->" + nums[i]);
                    streak = 0;
                }
            }

            if (i == nums.length - 2) {
                if (streak == 0) {
                    result.add(String.valueOf(nums[i + 1]));
                } else {
                    result.add(nums[i + 1 - streak] + "->" + nums[i + 1]);
                }
            }
        }

        return result;
    }
}