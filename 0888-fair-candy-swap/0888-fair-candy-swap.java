class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0;
        int bobTotal = 0;
        int[] ans = new int[2];
        for (int num : aliceSizes) {
            aliceTotal += num;
        }
        for (int num : bobSizes) {
            bobTotal += num;
        }

        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                if (aliceSizes[i] != bobSizes[j]) {
                    if (aliceTotal - aliceSizes[i] + bobSizes[j] == bobTotal - bobSizes[j] + aliceSizes[i]) {
                        return new int[]{aliceSizes[i], bobSizes[j]};
                    }
                }
            }
        }
        
        return ans;
    }
}