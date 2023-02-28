class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
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