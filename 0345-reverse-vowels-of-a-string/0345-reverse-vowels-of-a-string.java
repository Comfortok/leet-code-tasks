class Solution {
    public String reverseVowels(String s) {
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char a = s.charAt(start);
            char b = s.charAt(end);
            if (vowels.contains(a) && vowels.contains(b)) {
                sb.setCharAt(start, b);
                sb.setCharAt(end, a);
                start++;
                end--;
            } 
            
            if (!vowels.contains(a)) {
                start++;
            } 
            if (!vowels.contains(b)) {
                end--;
            }
        }
        
        return sb.toString();
    }
}