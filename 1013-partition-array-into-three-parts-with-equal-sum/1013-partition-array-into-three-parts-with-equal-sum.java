class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }


        if (sum % 3 == 0) {
            int count = 0;
            int avg = sum / 3;
            int part = 0;

            for (int i = 0; i < arr.length - 1; i++) {
                part += arr[i];
                if (part == avg) {
                    part = 0;
                    count++;
                    if (count == 2) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}