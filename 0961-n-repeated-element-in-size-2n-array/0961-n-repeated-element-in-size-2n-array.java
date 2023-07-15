class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int value = map.getOrDefault(num, 0) + 1;
            if (value > 1) return num;
            else map.put(num, value);
        }
        
        return -1;
    }
}