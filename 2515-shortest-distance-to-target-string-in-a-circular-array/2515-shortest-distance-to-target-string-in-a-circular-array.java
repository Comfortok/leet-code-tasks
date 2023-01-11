class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        if (words[startIndex].equals(target)) {
            return 0;
        }
        
        int targetIndexA = -1;
        int targetIndexB = -1;
        int backSteps = 0;
        int forwardSteps = 0;
        int shortest = -1;

        int startA = startIndex != words.length - 1 ? startIndex + 1 : 0;
        int startB = startIndex != 0 ? startIndex - 1 : words.length - 1;

        for (int i = startA, j = startB; i != startIndex && j != startIndex; ) {
            forwardSteps++;
            if (words[i].equals(target)) {
                targetIndexA = i;
            } else {
                if (i == words.length - 1) {
                    i = 0;
                } else {
                    i++;
                }
            }

            backSteps++;
            if (words[j].equals(target)) {
                targetIndexB = j;
            } else {
                if (j == 0) {
                    j = words.length - 1;
                } else {
                    j--;
                }
            }

            if (targetIndexA != -1) {
                shortest = forwardSteps;
                break;
            } else if (targetIndexB != -1) {
                shortest = backSteps;
                break;
            }
        }

        return shortest;
    }
}