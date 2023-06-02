class Solution {
    public int countValidWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        String regex = "([a-z]+(-?[a-z]+)?)?[!.,]?";
        return (int) Arrays.stream(words).filter(w -> w.matches(regex)).count();
    }
}