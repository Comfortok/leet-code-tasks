class Solution {
    public boolean findSubarrays(int[] nums) {
        boolean result = false;
        if (nums.length < 3) {
            return false;
        }
        Map<Integer, Integer> sumCount = new HashMap<>();
        
        for (int i = 1; i < nums.length; i++) {
            int subArrSum = nums[i - 1] + nums[i];
            sumCount.put(subArrSum, sumCount.getOrDefault(subArrSum, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : sumCount.entrySet()) {
            if (entry.getValue() > 1) {
                result = true;
            }
        }
        
        return result;
    }
}