class Solution {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int start = 0;
            int index = i;
            int end = nums.length - 1;
            int leftSum = getSum(nums, start, i);
            int rightSum = getSum(nums, i, end);
            if (leftSum == rightSum) {
                return index;
            }
        }
        
        return -1;
    }
    
    private int getSum(int[] nums, int start, int end) {
        int sum = 0;
        while (start <= end) {
            sum += nums[start];
            start++;
        }
        
        return sum;
    }
}