class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int boxes = 0;
        int size = 0;

        for (int i = 0; i < boxTypes.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < boxTypes.length; j++) {
                if (boxTypes[maxIndex][1] < boxTypes[j][1]) {
                    maxIndex = j;
                }
            }

            if (size + boxTypes[maxIndex][0] <= truckSize) {
                boxes += boxTypes[maxIndex][0] * boxTypes[maxIndex][1];
                size += boxTypes[maxIndex][0];
                int[] temp = boxTypes[i];
                boxTypes[i] = boxTypes[maxIndex];
                boxTypes[maxIndex] = temp;
            } else {
                boxes += boxTypes[maxIndex][1] * (truckSize - size);
                break;
            }
        }

        return boxes;
    }
}