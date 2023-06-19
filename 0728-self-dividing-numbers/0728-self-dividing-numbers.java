class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        while (left <= right) {
            if (left % 10 == 0) {
                left++;
                continue;
            }
            
            int num = left;
            boolean isValid = true;
            while (num > 9) {
                int a = num % 10;
                if (a == 0 || left % a != 0) {
                    isValid = false;
                    break;
                }
                num /= 10;
            }
            
            if (isValid && left % num == 0) {
                result.add(left);
            }
            
            left++;
        }
        
        return result;
    }
}