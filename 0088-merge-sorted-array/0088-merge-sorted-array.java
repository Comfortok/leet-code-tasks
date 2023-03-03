class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] copy1 = Arrays.copyOf(nums1, m);
            int i = 0;
            int l1 = 0;
            int l2 = 0;
            while (l1 < m || l2 < n) {
                if (l1 < m && l2 < n) {
                    if (copy1[l1] > nums2[l2]) {
                        nums1[i] = nums2[l2];
                        l2++;
                    } else {
                        nums1[i] = copy1[l1];
                        l1++;
                    }
                    i++;
                } else if (l1 == m) {
                    while (l2 < n) {
                        nums1[i] = nums2[l2];
                        l2++;
                        i++;
                    }
                } else if (l2 == n) {
                    while (l1 < m) {
                        nums1[i] = copy1[l1];
                        l1++;
                        i++;
                    }
                }
            }
    }
}