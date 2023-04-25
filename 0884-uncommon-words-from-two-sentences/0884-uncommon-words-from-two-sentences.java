class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map1 = fillWordsFrom(s1);
        Map<String, Integer> map2 = fillWordsFrom(s2);
        List<String> result = fillWordsFrom(map1, map2);    
        return result.toArray(String[]::new);    
    }
    
    private Map<String, Integer> fillWordsFrom(String s) {
        Map<String, Integer> map = new HashMap<>();
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return map;
    }
    
    private List<String> fillWordsFrom(Map<String, Integer> map1, Map<String, Integer> map2) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            if (entry.getValue() == 1 && !map2.containsKey(entry.getKey())) {
                result.add(entry.getKey());
            }
        }
        
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            if (entry.getValue() == 1 && !map1.containsKey(entry.getKey())) {
                result.add(entry.getKey());
            }
        }
        
        return result;
    }
    
}