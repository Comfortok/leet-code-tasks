class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) set.add(nums[j]);
            int val = set.size();
            set.clear();
            for (int j = i; j < nums.length; j++) {
                if (j + 1 < nums.length) set.add(nums[j + 1]);
            }
            res[i] = val - set.size();
            set.clear();
        }
        
        return res;
    }
}