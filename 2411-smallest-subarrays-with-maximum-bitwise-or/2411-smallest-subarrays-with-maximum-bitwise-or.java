class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int[] result = new int[nums.length];
        int[] last = new int[30];
        int n = nums.length;
        
        for (int i = n - 1; i >= 0; i--) {
            result[i] = 1;
            for (int j = 0; j < 30; j++) {
                if ((nums[i] & (1 << j)) > 0) {
                    last[j] = i;
                }
                
                result[i] = Math.max(result[i], last[j] - i + 1);
            }
        }
        
        return result;
    }
}