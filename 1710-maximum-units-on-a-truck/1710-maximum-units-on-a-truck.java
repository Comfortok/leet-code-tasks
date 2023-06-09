class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        for (int i = 0; i < boxTypes.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < boxTypes.length; j++) {
                if (boxTypes[maxIndex][1] < boxTypes[j][1]) {
                    maxIndex = j;
                }
            }

            if (i != maxIndex) {
                int[] temp = boxTypes[i];
                boxTypes[i] = boxTypes[maxIndex];
                boxTypes[maxIndex] = temp;
            }
        }

        int boxes = 0;
        int size = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            if (size > truckSize) {
                break;
            }

            if (size + boxTypes[i][0] <= truckSize) {
                boxes += boxTypes[i][0] * boxTypes[i][1];
            } else {
                boxes += boxTypes[i][1] * (truckSize - size);
            }

            size += boxTypes[i][0];
        }

        return boxes;
    }
}