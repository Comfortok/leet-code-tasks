class Solution {
    public int maxRepeating(String sequence, String word) {
        int result = 0;
        StringBuilder sb = new StringBuilder(word);
        for (int i = 0; i <= sequence.length() - sb.toString().length(); ) {
            String sub = sequence.substring(i, i + sb.toString().length());
            if (sb.toString().equals(sub)) {
                result++;
                sb.append(word);
            } else {
                i++;
            }
        }

        return result;
    }
}