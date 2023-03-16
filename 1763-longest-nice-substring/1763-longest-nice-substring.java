class Solution {
    public String longestNiceSubstring(String s) {
        String result = "";
        for (int i = 0; i < s.length() - 1; i++) {
            int start = i;
            int end = s.length();
            StringBuilder sub = new StringBuilder(s.substring(start, end));
            while (sub.length() > 1) {
                if (isNiceString(sub.toString())) {
                    if (sub.toString().length() > result.length()) {
                        result = sub.toString();
                    }
                }
                sub.deleteCharAt(sub.length() - 1);
            }
        }

        return result;
    }
    
    private boolean isNiceString(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!s.contains(String.valueOf(s.charAt(i)).toLowerCase())
                    || !s.contains(String.valueOf(s.charAt(i)).toUpperCase())) {
                return false;
            }
        }

        return true;
    }
}