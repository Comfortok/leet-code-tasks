class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int temp = 0;
        String temp1 = "";
        for (int i = 0; i < heights.length - 1; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[i] < heights[j]) {
                    temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                    temp1 = names[i];
                    names[i] = names[j];
                    names[j] = temp1;
                }
            }
        }
        
        return names;
    }
}