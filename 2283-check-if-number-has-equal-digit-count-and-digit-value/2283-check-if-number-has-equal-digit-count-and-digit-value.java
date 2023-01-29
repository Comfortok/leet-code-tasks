class Solution {
    public boolean digitCount(String num) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
            int intNum = (int) num.charAt(i) - 48;
            map.put(intNum, map.getOrDefault(intNum, 0) + 1);
        }

        for (int i = 0; i < num.length(); i++) {
            int intNum = (int) num.charAt(i) - 48;
            if (map.get(i) == null) {
                if (intNum != 0) {
                    return false;
                }
            } else if (map.get(i) != intNum) {
                return false;
            }
        }

        return true;
    }
}