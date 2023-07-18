class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) set.add(nums[j]);
            int val = set.size();
            set.clear();
            for (int j = i; j < nums.length; j++) {
                if (j + 1 < nums.length) set.add(nums[j + 1]);
            }
            map.put(i, val - set.size());
            set.clear();
        }
        
        int[] res = new int[nums.length];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            res[entry.getKey()] = entry.getValue();
        }
        
        return res;
    }
}