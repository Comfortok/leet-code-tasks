class Solution {
    public int[] separateDigits(int[] nums) {
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