class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> result = new ArrayList<>();
        for (int i = rounds[0]; i <= rounds[rounds.length - 1]; i++) {
            result.add(i);
        }
        
        if (result.size() > 0) {
            return result;
        }
        
        for (int i = 1; i <= rounds[rounds.length - 1]; i++) {
            result.add(i);
        }
        
        for (int i = rounds[0]; i <= n; i++) {
            result.add(i);
        }
        
        return result;
    }
}