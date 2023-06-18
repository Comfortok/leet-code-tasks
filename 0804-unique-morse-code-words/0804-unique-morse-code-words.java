class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            set.add(convert(words[i], morse));
        }
        
        return set.size();
    }
    
    private String convert(String word, String[] morse) {
        StringBuilder sb = new StringBuilder();
        for (char ch : word.toCharArray()) {
            sb.append(morse[(int) ch - 97]);
        }
        
        return sb.toString();
    }
}