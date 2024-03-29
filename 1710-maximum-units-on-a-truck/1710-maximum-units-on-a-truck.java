class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int [] unitCount = new int[1001];
        for (int [] boxType : boxTypes) {
            unitCount[boxType[1]] += boxType[0];
        }
        
        int boxes = 0;
        for (int i = unitCount.length - 1; i >= 0; i--) {
            if (unitCount[i] != 0) {
                int num = Math.min(unitCount[i], truckSize);
                boxes += num * i;
                truckSize -= num;
                if (truckSize == 0) {
                    break;
                }
            }
        }
        
        return boxes;
    }
}