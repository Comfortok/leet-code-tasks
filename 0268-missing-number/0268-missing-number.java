class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        Iterator it = set.iterator();
        int result = 0;
        while (it.hasNext()) {
            if(result != (int) it.next()) {
                break;
            }
            
            result++;
        }
        
        return result;
    }
}