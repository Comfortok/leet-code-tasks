class Solution {
    public int minTimeToType(String word) {
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            int currentSeconds;
            if (i == 0) {
                currentSeconds = getMinSeconds('a', word.charAt(i));
            } else {
                currentSeconds = getMinSeconds(word.charAt(i - 1), word.charAt(i));
            }
            result = result + currentSeconds + 1;
        }

        return result;
    }
    
    private int getMinSeconds(char pointer, char target) {
        int result = 0;
        int clockwiseSeconds;
        int counterClockwiseSeconds;

        if (target == pointer) {
            return result;
        }

        if (target > pointer) {
            clockwiseSeconds = target - pointer;
            counterClockwiseSeconds = ('z' - target) + (pointer - 'a') + 1;
        } else {
            counterClockwiseSeconds = pointer - target;
            clockwiseSeconds = ('z' - pointer) + (target - 'a') + 1;
        }

        return Math.min(clockwiseSeconds, counterClockwiseSeconds);
    }
}