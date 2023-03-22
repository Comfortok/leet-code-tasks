class Solution {
    public String reversePrefix(String word, char ch) {
        int end = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch){
                end = i;
                break;
            }
        }
        
        if (end == -1) {
            return word;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = end; i >= 0; i--) {
            sb.append(String.valueOf(word.charAt(i)));
        }
        
        return sb.toString() + word.substring(end + 1);
    }
}