class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int fivePercent = (5 * arr.length) / 100;

        int sum = 0;
        for (int i = fivePercent; i < arr.length - fivePercent; i++) {
            sum += arr[i];
        }

        return (double) sum / (double) (arr.length - (fivePercent * 2));
    }
}