class Solution {
    public int findNumbers(int[] nums) {
        int evens = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num > 9) {
                int count = 0;
                while (num > 9) {
                    num = num / 10;
                    count++;
                }
                if (count % 2 != 0) {
                    evens++;
                }
            }
        }
        
        return evens;
    }
}