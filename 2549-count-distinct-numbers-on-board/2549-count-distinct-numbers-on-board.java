class Solution {
    
    private Set<Integer> set = new HashSet<>();
    
    public int distinctIntegers(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                set.add(i);
                distinctIntegers(i);
            }
        }
        
        return set.size() + 1;
    }
    
}