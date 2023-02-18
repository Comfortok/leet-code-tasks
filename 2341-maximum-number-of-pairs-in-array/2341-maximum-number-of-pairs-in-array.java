class Solution {
    public int[] numberOfPairs(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] result = new int[2];
        int pair = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                pair++;
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        
        result[0] = pair;
        result[1] = set.size();
        return result;
    }
}