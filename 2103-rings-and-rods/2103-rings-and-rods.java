class Solution {
    public int countPoints(String rings) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 1; i < rings.length(); i++) {
            String value = String.valueOf(rings.charAt(i - 1));
            Integer key = Integer.valueOf(rings.charAt(i));
            map.put(key, map.getOrDefault(key, "") + value);
        }
        
        int result = 0;
        for(Map.Entry<Integer, String> pair : map.entrySet()) {
            if (pair.getValue().contains("R") && pair.getValue().contains("G") && pair.getValue().contains("B")) {
                result++;
            }
        }
        
        return result;
    }
}