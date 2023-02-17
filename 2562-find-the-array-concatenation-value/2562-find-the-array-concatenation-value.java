class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long result = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i < j || i == j) {
            String first = String.valueOf(nums[i]);
            String last = i == j ? "" : String.valueOf(nums[j]);
            result += Long.parseLong(first + last);
            i++;
            j--;
        }

        return result;
    }
}