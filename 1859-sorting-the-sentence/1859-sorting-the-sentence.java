class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] res = new String[arr.length];
        int index = 0;
        for (String str : arr) {
            index = (int) (str.charAt(str.length() - 1) - '0');
            res[index - 1] = str.substring(0, str.length() - 1);
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            sb.append(res[i]).append(" ");
        }
        
        return sb.toString().trim();
    }
}