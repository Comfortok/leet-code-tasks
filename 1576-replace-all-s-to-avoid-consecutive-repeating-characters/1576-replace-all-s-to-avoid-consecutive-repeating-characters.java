class Solution {
    public String modifyString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char curr = sb.charAt(i);
            if (curr == '?') {
                for (char ch = 'a'; ch <= 'c'; ch++) {
                    if (i > 0 && sb.charAt(i - 1) == ch) continue;
                    if (i + 1 < sb.length() && sb.charAt(i + 1) == ch) continue;
                    sb.replace(i, i + 1, String.valueOf(ch));
                    break;
                }
            }
        }

        return sb.toString();
    }
}