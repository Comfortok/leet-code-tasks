class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return numFrom(firstWord) + numFrom(secondWord) == numFrom(targetWord);
    }
    
    private int numFrom(String word) {
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            result = (result * 10) + (word.charAt(i) - 'a');
        }
        
        return result;
    }
}