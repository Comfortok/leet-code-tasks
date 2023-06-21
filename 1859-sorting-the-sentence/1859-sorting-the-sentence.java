class Solution {
    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 1;
        int i = s.indexOf(String.valueOf(index));
        while (i != -1) {
            int spaceIndex = 0;
            for (int j = i; j >= 0; j--) {
                if (s.charAt(j) == ' ') {
                    spaceIndex = j;
                    break;
                }
            }
            
            spaceIndex = spaceIndex == 0 ? 0 : spaceIndex + 1;
            String word = s.substring(spaceIndex, i) + " ";
            sb.append(word);
            i = s.indexOf(String.valueOf(++index)); 
        }
        
        sb.deleteCharAt(sb.length() - 1);
        
        return sb.toString();
    }
}