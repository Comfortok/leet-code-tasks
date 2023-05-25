class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[end] + nums[start] == 0) {
                return nums[end];
            } else if (nums[end] > Math.abs(nums[start])) {
                end--;
            } else {
                start++;
            }
        }
        
        return -1;
    }
}