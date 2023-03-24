class Solution {
    public int rearrangeCharacters(String s, String target) {
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        while(hasTargetWord(sb, target)) {
            count++;
        }
        
        return count;
    }
    
    private boolean hasTargetWord(StringBuilder sb, String target) {
        for (int i = 0; i < target.length(); i++) {
            int indexOfChar = sb.indexOf(String.valueOf(target.charAt(i)));
            if (indexOfChar == -1) {
                return false;
            } else {
                sb.deleteCharAt(indexOfChar);
            }
        }
        
        return true;
    }
}