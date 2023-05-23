class Solution {
    public int fillCups(int[] amount) {
        int seconds = 0;
        Arrays.sort(amount);
        while (amount[2] > 0) {
            amount[2]--;
            if (amount[1] > 0) {
                amount[1]--;
            }
            seconds++;
            Arrays.sort(amount);
        }
        
        return seconds;
    }
}