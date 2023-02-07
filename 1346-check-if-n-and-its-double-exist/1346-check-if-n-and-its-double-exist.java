class Solution {
    public boolean checkIfExist(int[] arr) {
        if (arr.length == 2 && (arr[0] == arr[1] * 2 || arr[1] == arr[0] * 2)) {
            return true;
        }
        
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i * 2) || (i % 2 == 0 && set.contains(i/2))) {
                return true;
            } else {
                set.add(i);
            }
        }
            
        return false;
    }
}