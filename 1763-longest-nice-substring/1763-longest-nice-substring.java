class Solution {
    public String longestNiceSubstring(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            int start = i;
            int end = s.length();
            StringBuilder sub = new StringBuilder(s.substring(start, end));
            while (sub.length() > 1) {
                if (isNiceString(sub.toString())) {
                    result.add(sub.toString());
                }
                sub.deleteCharAt(sub.length() - 1);
            }
        }

        if (result.isEmpty()) {
            return "";
        } else {
            String first = result.get(0);
            for (String str : result) {
                if (str.length() > first.length()) {
                    first = str;
                }
            }

            return first;
        }
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