class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i = i + 2) {
            for (int j = 0; j < nums[i]; j++) {
                result.add(nums[i + 1]);
            }
        }
        
        int[] arr = new int[result.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }
}