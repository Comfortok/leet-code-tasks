class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int pos = nums.length - 1;
        while (start <= end) {
            if (nums[start] * nums[start] > nums[end] * nums[end]) {
                result[pos] = nums[start] * nums[start];
                start++;
            } else {
                result[pos] = nums[end] * nums[end];
                end--;
            }
            pos--;
        }
        
        return result;
    }
}