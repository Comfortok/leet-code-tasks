class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        // int temp = 0;
        // String temp1 = "";
        // for (int i = 0; i < heights.length - 1; i++) {
            // for (int j = i + 1; j < heights.length; j++) {
                // if (heights[i] < heights[j]) {
                    // temp = heights[i];
                    // heights[i] = heights[j];
                    // heights[j] = temp;
                    // temp1 = names[i];
                    // names[i] = names[j];
                    // names[j] = temp1;
                // }
            // }
        // }
        
        String[] result = new String[names.length];
        Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        
        int i = 0;
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            result[i] = entry.getValue();
            i++;
        }
        
        return result;
    }
}