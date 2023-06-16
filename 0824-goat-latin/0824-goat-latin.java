class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        boolean isNewWord = true;
        String as = "a";
        String ma = "";
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (isNewWord) {
                if (i == sentence.length() - 1) {
                    sb.append(String.valueOf(ch));
                    sb.append("ma");
                    sb.append(as);
                } else {
                    if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        ma = "ma";
                        sb.append(String.valueOf(ch));
                    } else {
                        ma = String.valueOf(ch) + "ma";
                    }
                }
                
                isNewWord = false;
            } else if (ch == ' ' || i == sentence.length() - 1) {
                isNewWord = true;
                if (i == sentence.length() - 1) {
                    sb.append(String.valueOf(ch));
                    sb.append(ma);
                    sb.append(as);
                } else {
                    sb.append(ma);
                    sb.append(as + " ");
                }
                as = as.concat("a");
            } else {
                sb.append(String.valueOf(ch));
            }
        }
        
        return sb.toString();
    }
}