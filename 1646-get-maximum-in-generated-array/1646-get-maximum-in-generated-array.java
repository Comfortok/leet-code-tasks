class Solution {
    public int getMaximumGenerated(int n) {
        int max = 0;
        int[] nums = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i < 2) {
                nums[i] = i;
            } 
            
            if (i * 2 <= n && i * 2 >= 2) {
                nums[2 * i] = nums[i];
            }
            
            if (i * 2 + 1 <= n && i * 2 + 1 >= 2) {
                nums[2 * i + 1] = nums[i] + nums[i + 1];
            }
            
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        
        return max;
    }
}