class Solution {
    public long pickGifts(int[] gifts, int k) {
        for (int i = 0; i < k; i++) {
            Map<Integer, Integer> currentMax = getMax(gifts);
            Map.Entry<Integer, Integer> entry = currentMax.entrySet().iterator().next();
            int e = (int) Math.sqrt(entry.getKey());
             gifts[entry.getValue()] = e;
        }
        
        long sum = 0;
        for (int gift : gifts) {
            sum += gift;
        }

        return sum;
    }
    
    private Map<Integer, Integer> getMax(int[] gifts) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int index = 0;
        for (int i = 0; i < gifts.length; i++) {
            if (gifts[i] > max) {
                max = gifts[i];
                index = i;
            }
        }

        map.put(max, index);
        return map;
    }
}