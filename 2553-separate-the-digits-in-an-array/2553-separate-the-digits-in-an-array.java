class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int num: nums) {
            sb.append(num);
        }
        
        int[] ans = new int[sb.length()];
        for (int i = 0; i < sb.length(); i++) {
            ans[i] = sb.charAt(i) - '0';
        }
        
        return ans;
        
    }
    
    public int[] separateDigits2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num < 10) {
                list.add(num);
            } else {
                String strVal = String.valueOf(num);
                for (int i = 0; i < strVal.length(); i++) {
                    list.add(strVal.charAt(i) - '0');
                }
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray(); 
    }
    
}