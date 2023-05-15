class Solution {
    public int minMaxGame(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        
        int[] arr = new int[nums.length / 2];
        int index = 0;    
        for (int i = 1; i < nums.length; i += 2) {
            if (index % 2 == 0) {
                arr[index] = Math.min(nums[i], nums[i - 1]);
            } else {
                arr[index] = Math.max(nums[i], nums[i - 1]);
            }
            index++;
        }
        
        return minMaxGame(arr);
    }
}