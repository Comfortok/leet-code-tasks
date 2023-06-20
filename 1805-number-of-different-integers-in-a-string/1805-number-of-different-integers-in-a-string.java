class Solution {
    public int numDifferentIntegers(String word) {
        String[] arr = word.replaceAll("[a-z]", " ").split("\\s+");
        Set<String> set = new HashSet<>();
            
        for (String num : arr) {
            if (!num.isEmpty()) {
                set.add(String.valueOf(num.replaceAll("^0*","")));
            }
        }
                
        return set.size();
    }
}