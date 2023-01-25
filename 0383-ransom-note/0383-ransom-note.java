class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean result = true;
        List<Character> charList = new ArrayList<>();
        for (int i = 0; i < magazine.length(); i++) {
            charList.add(magazine.charAt(i));
        }
        
        for (int i = 0; i < ransomNote.length(); i++) {
            Character ch = ransomNote.charAt(i);
            if (charList.size() == 0 || !charList.contains(ch)) {
                result = false;
                break;
            }
            
            int charIndex = charList.indexOf(ch);
            charList.remove(charIndex);
        }
        
        return result;
    }
}