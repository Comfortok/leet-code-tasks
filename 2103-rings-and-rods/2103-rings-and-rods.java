class Solution {
    public int countPoints(String rings) {
        Set<Integer> r = new HashSet<>();
        Set<Integer> g = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        for (int i = 0; i < rings.length(); i += 2) {
            if (rings.charAt(i) == 'R') {
                r.add(rings.charAt(i + 1) - '0');
            } else if (rings.charAt(i) == 'B') {
                b.add(rings.charAt(i + 1) - '0');
            } else {
                g.add(rings.charAt(i + 1) - '0');
            }
        }
        
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if (r.contains(i) && g.contains(i) && b.contains(i))
                result++;
        }
        
        return result;
    }
}