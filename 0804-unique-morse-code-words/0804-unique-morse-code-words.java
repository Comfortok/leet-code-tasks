class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : words[i].toCharArray()) {
                sb.append(morse[(int) ch - 97]);
            }
            set.add(sb.toString());
        }
        
        return set.size();
    }
}