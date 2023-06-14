class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0;
        int bobTotal = 0;
        Set<Integer> set = new HashSet<>();
        
        for (int num : aliceSizes) {
            aliceTotal += num;
        }
        for (int num : bobSizes) {
            bobTotal += num;
            set.add(num);
        }
        
        int d = (bobTotal - aliceTotal) / 2;

        for (int num : aliceSizes) {
            if (set.contains(num + d)) {
                return new int[]{num, num + d};
            }
        }
        
        return new int[0];
    }
}