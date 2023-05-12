class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        
        Arrays.sort(stones);
        for (int i = stones.length - 1; i > 0; ) {
            if (stones[i] == -1) {
                return 0;
            } else if(stones[i - 1] == -1) {
                return stones[i];
            }
            
            if (stones[i] - stones[i - 1] == 0) {
                stones[i - 1] = -1;
            } else {
                stones[i - 1] = stones[i] - stones[i - 1];
            }
            stones[i] = -1;
            Arrays.sort(stones);
        }
        
        return 0;
    }
}