class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        
        if (s.equals(goal)) {
            Set<Character> chars = new HashSet<>();
            for (char ch : s.toCharArray()) {
                chars.add(ch);
            }
            
            return s.length() > chars.size();
        }
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                list.add(i);
            }
        }
        
        if (list.size() != 2) {
            return false;
        } else {
            int ind1 = list.get(0);
            int ind2 = list.get(1);
            if (s.charAt(ind1) == goal.charAt(ind2) && s.charAt(ind2) == goal.charAt(ind1)) {
                return true;
            } else {
                return false;
            }
        }
    }
}