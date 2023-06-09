class Solution {
    public int countLargestGroup(int n) {
        int[] map = new int[37];
        int maxCount = 0;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            
            ++map[sum];
            if (maxCount < map[sum]) {
                maxCount = map[sum];
                ans = 1;
            } else if (maxCount == map[sum]) {
                ans++;
            }
        }
        
        return ans;
    }
}