class Solution {
    public String[] divideString(String s, int k, char fill) {
        double n = s.length() / k;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i = i + k) {
            String str;
            if (i + k - 1 < s.length()) {
                str = s.substring(i, i + k);
            } else {
                str = s.substring(i, s.length());
                for (int j = str.length(); j < k; j++) {
                    str += String.valueOf(fill);
                }
            }
            
            list.add(str);
        }
        
        return list.toArray(String[]::new);
    }
}