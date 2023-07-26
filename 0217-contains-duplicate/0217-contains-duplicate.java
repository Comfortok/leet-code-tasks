class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int num : nums) {
        //     if (map.get(num) != null) {
        //         return false;
        //     }
        //     map.put(num, num);
        // }
        
        // return true;
        
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            else set.add(num);
        }
        return false;
        // return set.size() == nums.length;
    }
}