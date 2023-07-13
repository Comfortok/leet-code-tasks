class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int minIndex = -1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    if (minIndex == -1) {
                        minIndex = i + j;
                        list.add(i);
                    } else if (minIndex > i + j) {
                        minIndex = i + j;
                        list.clear();
                        list.add(i);
                    } else if (minIndex == i + j) {
                        list.add(i);
                    }
                }
            }
        }
        
        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list1[list.get(i)];
        }
        
        return result;
    }
}