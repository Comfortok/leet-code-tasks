class Solution {
    public int[] sortByBits(int[] arr) {
        int[] bits = new int[arr.length];
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            bits[i] = Integer.bitCount(arr[i]);
        }
        int tempBit = -1;
        int tempNum = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if ((bits[j - 1] > bits[j]) || (bits[j - 1] == bits[j] && arr[j - 1] > arr[j])) {
                    tempBit = bits[j - 1];
                    tempNum = arr[j - 1];
                    bits[j - 1] = bits[j];
                    arr[j - 1] = arr[j];
                    arr[j] = tempNum;
                    bits[j] = tempBit;
                }
            }
        }
        
        return arr;
    }
}