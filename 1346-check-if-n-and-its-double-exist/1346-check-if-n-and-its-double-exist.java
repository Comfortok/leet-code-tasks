class Solution {
    public boolean checkIfExist(int[] arr) {
        if (arr.length == 2 && (arr[0] == arr[1] * 2 || arr[1] == arr[0] * 2)) {
            return true;
        }
            
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] * 2 || arr[j] == arr[i] * 2) {
                    return true;
                }
            }
        }
            
        return false;
    }
}