class Solution {
    public boolean lemonadeChange(int[] bills) {
Map<Integer, Integer> map = new HashMap<>();
        if (bills[0] != 5) {
            return false;
        }

        for (int bill : bills) {
            if (bill == 5) {
                map.put(bill, map.getOrDefault(bill, 0) + 1);
            } else if (bill == 10) {
                if (!map.containsKey(5)) {
                    return false;
                } else {
                    if (map.get(5) > 0) {
                        int val = map.get(5) - 1;
                        if (val == 0) {
                            map.remove(5);
                        } else {
                            map.put(5, val);
                        }
                    }
                    map.put(10, map.getOrDefault(10, 0) + 1);
                }
            } else {
                if (!map.containsKey(5)) {
                    return false;
                } else {
                    if (map.containsKey(10)) {
                        int tenVal = map.get(10) - 1;
                        int fiveVal = map.get(5) - 1;
                        if (tenVal == 0) {
                            map.remove(10);
                        } else {
                            map.put(10, tenVal);
                        }

                        if (fiveVal == 0) {
                            map.remove(5);
                        } else {
                            map.put(5, fiveVal);
                        }
                    } else {
                        int fiveVal = map.get(5) - 3;
                        if (fiveVal < 0) {
                            return false;
                        } else if (fiveVal == 0) {
                            map.remove(5);
                        } else {
                            map.put(5, fiveVal);
                        }
                    }

                    map.put(20, map.getOrDefault(20, 0) + 1);
                }
            }

        }

        return true;
    }
}