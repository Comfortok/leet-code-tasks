class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder res = new StringBuilder();
        StringBuilder as = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (!"aeiouAEIOU".contains(words[i].charAt(0) + "")) {
                res.append(words[i].substring(1)).append(words[i].charAt(0)).append("maa").append(as + " ");
            } else {
                res.append(words[i]).append("maa").append(as + " ");
            }
            as.append("a");
        }
        
        return res.toString().trim();
    }
}