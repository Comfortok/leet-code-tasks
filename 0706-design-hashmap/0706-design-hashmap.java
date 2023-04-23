class MyHashMap {
    
    private Integer[] keys;
    private Integer[] values;

    public MyHashMap() {
        keys = new Integer[1_000_001];
        values = new Integer[1_000_001];
    }
    
    public void put(int key, int value) {
        this.keys[key] = key;
        this.values[key] = value;
    }
    
    public int get(int key) {
        if (this.values[key] == null) {
            return -1;
        }
        return this.values[key];
    }
    
    public void remove(int key) {
        if (this.values[key] != null) {
            this.values[key] = null;
            this.keys[key] = null;
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