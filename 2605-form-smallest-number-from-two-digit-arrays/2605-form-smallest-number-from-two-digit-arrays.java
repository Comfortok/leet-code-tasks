class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int start1 = 0;
        int start2 = 0;
        while (start1 < nums1.length && start2 < nums2.length) {
            if (nums1[start1] == nums2[start2]) {
                return nums1[start1];
            } else if (nums1[start1] > nums2[start2]) {
                start2++;
            } else {
                start1++;
            }
        }
        
        String result = nums1[0] < nums2[0] ? "" + nums1[0] + nums2[0] : "" + nums2[0] + nums1[0];
        return Integer.valueOf(result);
    }
}