class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        List<String> result = new ArrayList<>();
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        for (int i = 0; i < str1.length; i++) {
            map1.put(str1[i], map1.getOrDefault(str1[i], 0) + 1);
        }
        
        for (int i = 0; i < str2.length; i++) {
            map2.put(str2[i], map2.getOrDefault(str2[i], 0) + 1);
        }
        
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
        
        return result.toArray(String[]::new);
    }
}