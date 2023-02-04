class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Deque<Character> charDeq = new ArrayDeque<>(s.length());
        for (int i = 0; i < s.length(); i++)
            switch (s.charAt(i)) {
                case '(':
                    charDeq.push(')');
                    break;
                case '{':
                    charDeq.push('}');
                    break;
                case '[':
                    charDeq.push(']');
                    break;
                default:
                    if (charDeq.isEmpty() || charDeq.pop() != s.charAt(i)) {
                        return false;
                    }
            }
        
        return charDeq.isEmpty();
    }
}