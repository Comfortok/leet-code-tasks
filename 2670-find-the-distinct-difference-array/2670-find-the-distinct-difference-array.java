class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        boolean[] prefixSeen = new boolean[51];
        boolean[] suffixSeen = new boolean[51];

        for (int i = 0, j = 1; i < n; i++) {
            if (!prefixSeen[nums[i]]) {
                prefixSeen[nums[i]] = true;
                prefix[i] = j++;
            } else if (i > 0) {
                prefix[i] = prefix[i-1];
            }
        }

        for (int i = n-1, j = 1; i >= 0; i--) {
            if (!suffixSeen[nums[i]]) {
                suffixSeen[nums[i]] = true;
                suffix[i] = j++;
            } else if (i < n-1) {
                suffix[i] = suffix[i+1];
            }
        }

        for (int i = 0; i < n-1; i++) {
            answer[i] = prefix[i] - suffix[i+1];
        }
        answer[n-1] = prefix[n-1];

        return answer;
    }
}