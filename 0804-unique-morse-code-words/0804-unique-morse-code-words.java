class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                //a - 0, b - 1, c - 2, ...
                char ch = word.charAt(j);
                sb.append(morse[ch - 'a']);
            }
            set.add(sb.toString());
        }
        
        return set.size();
    }
}