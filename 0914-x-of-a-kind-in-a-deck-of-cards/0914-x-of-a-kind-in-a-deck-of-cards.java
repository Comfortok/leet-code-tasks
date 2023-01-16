class Solution {
    public boolean hasGroupsSizeX(int[] deck) {    
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < deck.length; i++) {
            map.put(deck[i], map.getOrDefault(deck[i], 0) + 1);
        }
        
        int result = 0;
        for (Integer vakue : map.values()) {
            result = gcd(vakue, result);
        }
        
        return result > 1;
    }
    
    public int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }
}