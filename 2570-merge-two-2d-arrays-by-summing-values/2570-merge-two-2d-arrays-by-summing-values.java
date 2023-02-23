class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[][] arr = new int[nums1.length + nums2.length][2];
        int a = 0;
        int b = 0;
        int length = nums1.length + nums2.length;

        for (int i = 0; i < length; i++) {
            if (a == nums1.length) {
                while (i < length) {
                    arr[i] = nums2[b];
                    b++;
                    i++;
                }
                break;
            } else if (b == nums2.length) {
                while (i < length) {
                    arr[i] = nums1[a];
                    a++;
                    i++;
                }
                break;
            } else {
                if (nums1[a][0] < nums2[b][0]) {
                    arr[i] = nums1[a];
                    a++;
                } else if (nums1[a][0] > nums2[b][0]) {
                    arr[i] = nums2[b];
                    b++;
                } else {
                    arr[i][0] = nums1[a][0];
                    arr[i][1] = nums1[a][1] + nums2[b][1];
                    a++;
                    b++;
                    length--;
                }
            }
        }

        int[][] result = new int[length][2];
        for (int i = 0; i < length; i++) {
            result[i][0] = arr[i][0];
            result[i][1] = arr[i][1];
        }

        return result;
    }
}