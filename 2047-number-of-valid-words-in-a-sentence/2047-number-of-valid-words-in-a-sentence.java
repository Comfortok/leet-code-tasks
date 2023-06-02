class Solution {
    public int countValidWords(String sentence) {
        String regex = "^([a-z]+(-?[a-z]+)?)?([!.,])?$";
        String digitRegex = "\\D+";
        String[] words = sentence.split("\\s+");
        int count = 0;
        for (String s : words) {
            if (s.matches(regex) && s.matches(digitRegex)) {
                count++;
            }
        }
        
        return count;
    }
}