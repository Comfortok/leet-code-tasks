class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, Comparator.comparingInt(o -> -o[1]));
		int boxes = 0;
        int i = 0;
        int n = boxTypes.length;
		while (i < n && truckSize > 0) {
			int max = Math.min(boxTypes[i][0], truckSize);
			boxes += max * boxTypes[i][1];
			i++;
			truckSize -= max;
		}
        
		return boxes;
    }
}