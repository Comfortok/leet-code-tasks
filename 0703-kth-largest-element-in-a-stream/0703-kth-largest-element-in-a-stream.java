class KthLargest {
    
    List<Integer> list;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
           this.list.add(i, nums[i]);
        }
    }
    
    public int add(int val) {
        this.list.add(val);
        Collections.sort(list);
        return list.get(list.size() - k);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */