class Solution {
    public int[] sortByBits(int[] arr) {
        int temp = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                int a = Integer.bitCount(arr[j - 1]);
                int b = Integer.bitCount(arr[j]);
                if ((a > b) || (a == b && arr[j - 1] > arr[j])) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        return arr;
    }
}