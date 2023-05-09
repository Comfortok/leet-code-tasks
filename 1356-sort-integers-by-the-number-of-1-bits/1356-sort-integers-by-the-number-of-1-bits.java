class Solution {
    public int[] sortByBits(int[] arr) {
        int temp = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if ((Integer.bitCount(arr[j - 1]) > Integer.bitCount(arr[j])) 
                    || (Integer.bitCount(arr[j - 1]) == Integer.bitCount(arr[j]) && arr[j - 1] > arr[j])) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        return arr;
    }
}