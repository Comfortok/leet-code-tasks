class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long result = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i < j || i == j) {
            int first = nums[i];
            int last = i == j ? -1 : nums[j];
            int zeroCount = (int) (Math.log10(last) + 1);
            long con = last != -1 ? (first * (int) Math.pow(10, zeroCount)) + last : first;
            result += con;
            i++;
            j--;
        }

        return result;
    }
}