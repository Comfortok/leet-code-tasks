class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char a = s.charAt(start);
            char b = s.charAt(end);
            if (!vowels.contains(a + "")) {
                start++;
                continue;
            }

            if (!vowels.contains(b + "")) {
                end--;
                continue;
            }

            sb.setCharAt(start, b);
            sb.setCharAt(end, a);
            start++;
            end--;
        }

        return sb.toString();
    }
}