class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int l1 = 0;
        int l2 = 0;
        int a = start;
        
        while (a != destination) {
            l1 += distance[a];
            if (a == distance.length - 1) {
                a = 0;
            } else {
                a++;   
            }
        }
        
        while (start != destination) {
            if (start == 0) {
                start = distance.length - 1;
            } else {
                start--;   
            }
            
            l2 += distance[start];
        }
        
        return Math.min(l1, l2);
    }
    
}