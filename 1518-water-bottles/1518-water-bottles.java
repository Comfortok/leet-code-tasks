class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;
        while (numBottles > numExchange - 1) {
            int full = numBottles / numExchange;
            count += full;
            numBottles = (numBottles % numExchange) + full;
        }
        
        return count;
    }
}