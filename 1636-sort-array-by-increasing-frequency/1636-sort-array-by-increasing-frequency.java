class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        
        Comparator<Map.Entry<Integer, Integer>> valueComparator = new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
                Integer v1 = e1.getValue();
                Integer v2 = e2.getValue();
                if (v1 == v2) {
                    return e2.getKey() - e1.getKey();
                }
                
                return v1 - v2;
            }
        };
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(count.entrySet());
        
        Collections.sort(list, valueComparator);
        
        int[] result = new int[nums.length];
        int j = 0;
        
       for (Map.Entry<Integer, Integer> k : list) {
            int val = k.getValue();
            while(val > 0) {
                result[j] = k.getKey();
                j++;
                val--;
            }
        }
        
        return result;
    }
}