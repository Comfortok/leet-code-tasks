class RecentCounter {

    List<Integer> requests;
    
    public RecentCounter() {
        this.requests = new ArrayList<>();
    }
    
    public int ping(int t) {
        int count = 1;
        if (!requests.isEmpty()) {
            for (int i = requests.size() - 1; i >= 0; i--) {
                if (t - 3000 <= requests.get(i) && requests.get(i) <= t) {
                    count++;
                } else {
                    break;
                }
            }
        }
        
        requests.add(t);
        
        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */