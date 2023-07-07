class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;
        for (int num : gain) {
            current += num;
            max = Math.max(current, max);
        }
        
        return max;
    }
}