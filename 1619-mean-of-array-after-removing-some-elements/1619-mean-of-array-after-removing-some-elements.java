class Solution {
    public double trimMean(int[] arr) {
        List<Integer> list = Arrays
                .stream(arr)
                .boxed()
                .sorted()
                .collect(Collectors.toList());
        int fivePercent = (5 * list.size()) / 100;

        int sum = 0;
        for (int i = fivePercent; i < list.size() - fivePercent; i++) {
            sum += list.get(i);
        }

        double size = list.size() - (fivePercent * 2);

        int multiplier = (int) Math.pow(10, 5);
        double result = sum / size;
        String strResult = String.valueOf(result);

        return (double) ((long) ((Double.parseDouble(strResult)) * multiplier)) / multiplier;
    }
}