class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int fivePercent = (5 * arr.length) / 100;

        int sum = 0;
        for (int i = fivePercent; i < arr.length - fivePercent; i++) {
            sum += arr[i];
        }

        double size = arr.length - (fivePercent * 2);

        int multiplier = (int) Math.pow(10, 5);
        double result = sum / size;
        String strResult = String.valueOf(result);

        return (double) ((long) ((Double.parseDouble(strResult)) * multiplier)) / multiplier;
    }
}