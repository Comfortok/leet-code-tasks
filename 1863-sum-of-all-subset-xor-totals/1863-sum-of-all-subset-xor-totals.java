class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int total = 0;

        for (int i = 0; i < (1 << n); i++) {
            int subTotal = 0;
            int m = 1; // m is used to check set bit in binary representation.
            for (int num : nums) {
                if ((i & m) > 0) {
                    subTotal ^= num;
                }
                m = m << 1;
            }

            total += subTotal;
        }

        return total;
    }
    
}