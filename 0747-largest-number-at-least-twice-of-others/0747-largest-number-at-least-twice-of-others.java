class Solution {
    public int dominantIndex(int[] nums) {
        int index = -1;
        int max = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                temp = max;
                max = nums[i];
                index = i;
            } else {
                if (nums[i] > temp) {
                    temp = nums[i];
                }
            }
        }
        
        if (max < temp * 2) {
            index = -1;
        }
        
        return index;
    }
}