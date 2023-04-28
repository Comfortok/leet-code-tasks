class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int start = 0;
            int end = image[0].length - 1;
            while (start <= end) {
                if (start == end) {
                    image[i][start] = image[i][start] == 0 ? 1 : 0;
                } else {
                    int temp = image[i][end] == 0 ? 1 : 0;
                    image[i][end] = image[i][start] == 0 ? 1 : 0;
                    image[i][start] = temp;
                }
                start++;
                end--;
            }
        }
        
        return image;
    }
}