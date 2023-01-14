class Solution {
    public int maxJump(int[] stones) {
        int maxStep = -1;
        int lastStoneIndex = stones.length - 1;
        
        for (int i = 0; i <= lastStoneIndex - 1; ) {
            int nextStoneIndex;
            
            if (i + 1 == lastStoneIndex) {
                nextStoneIndex = i + 1;
            } else {
                nextStoneIndex = i + 2;
            }
            
            if (stones[nextStoneIndex] - stones[i] > maxStep) {
                maxStep = stones[nextStoneIndex] - stones[i];
            }
            
            i = nextStoneIndex;
        }
        
        for (int i = lastStoneIndex; i > 0; ) {
            int nextStoneIndex;
            
            if (i - 1 == 0 || (i == lastStoneIndex && lastStoneIndex % 2 == 0)) {
                nextStoneIndex = i - 1;
            } else {
                nextStoneIndex = i - 2;
            }
            
            if (stones[i] - stones[nextStoneIndex] > maxStep) {
                maxStep = stones[i] - stones[nextStoneIndex];
            }
            
            i = nextStoneIndex;
        }
        
        return maxStep;
    }
}