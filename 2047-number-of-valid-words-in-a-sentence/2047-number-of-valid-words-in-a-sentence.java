class Solution {
    public int countValidWords(String sentence) {
        String[] words = sentence.strip().split("\\s+");
        int count = 0;
        for (String word : words) {
            if (isValid(word)) {
                count++;
            }
        }
        return count;
    }
    
    private boolean isValid(String word) {
        if (((word.lastIndexOf('!') != -1) && (word.lastIndexOf('!') != word.indexOf('!') || word.indexOf('!') != word.length() - 1))
                || ((word.lastIndexOf('.') != -1) && (word.lastIndexOf('.') != word.indexOf('.') || word.indexOf('.') != word.length() - 1))
                || ((word.lastIndexOf(',') != -1) && (word.lastIndexOf(',') != word.indexOf(',') || word.indexOf(',') != word.length() - 1))
                || ((word.lastIndexOf('-') != -1) && (word.lastIndexOf('-') != word.indexOf('-') || word.indexOf('-') == 0 || word.indexOf('-') == word.length() - 1
                || !Character.isAlphabetic(word.charAt(word.indexOf('-') + 1))))) {
            return false;
        } else {
            for (int i = 0; i < word.length(); i++) {
                if (Character.isDigit(word.charAt(i))) {
                    return false;
                }
            }
        }
        
        return true;
    }
}