class Solution {
    public int subsetXORSum(int[] nums) {
        int total = 0;
        List<List<Integer>> list = getSubLists(nums);
        for (List<Integer> integerList : list) {
            int subTotal = 0;
            for (Integer num : integerList) {
                subTotal ^= num;
            }
            total += subTotal;
        }

        return total;
    }
    
    private List<List<Integer>> getSubLists(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        // Run a loop from 0 to 2^n
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> subList = new ArrayList<>();
            int m = 1; // m is used to check set bit in binary representation.
            for (int num : nums) {
                if ((i & m) > 0) {
                    subList.add(num);
                }
                m = m << 1;
            }
            result.add(subList);
        }

        return result;
    }
}