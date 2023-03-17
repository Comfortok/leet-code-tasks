class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        int pos = 0;
        
        for (int i = 0; i < nums.length - 1; i = i + 2) {
            size += nums[i];
        }
        
        int[] result = new int[size];
        
        for (int i = 0; i < nums.length - 1; i = i + 2) {
            for (int j = 0; j < nums[i]; j++) {
                result[pos] = nums[i + 1];
                pos++;
            }
        }
        
        return result;
    }
}