class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (int i = 0; i < nums.length; i++) {
            elementSum += nums[i];
            String strNum = String.valueOf(nums[i]);
            for (int j = 0; j < strNum.length(); j++) {
                digitSum += ((int)strNum.charAt(j) - 48);
            }
        }
        
        return Math.abs(elementSum - digitSum);
    }
}