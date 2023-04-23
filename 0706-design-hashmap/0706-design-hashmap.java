class MyHashMap {
    
    private Integer[] arr;

    public MyHashMap() {
        arr = new Integer[1_000_001];
    }
    
    public void put(int key, int value) {
        this.arr[key] = value;
    }
    
    public int get(int key) {
        if (this.arr[key] == null) {
            return -1;
        }
        return this.arr[key];
    }
    
    public void remove(int key) {
        if (this.arr[key] != null) {
            this.arr[key] = null;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */