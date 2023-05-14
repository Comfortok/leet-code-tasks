class Solution {
    public int countPoints(String rings) {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if (rings.indexOf("R" + i) > -1 && rings.indexOf("G" + i) > -1 && rings.indexOf("B" + i) > -1) {
                result++;
            }
        }
        
        return result;
    }
}