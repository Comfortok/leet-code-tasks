/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            if (end - start < 2) {
                if (isBadVersion(start)) {
                    return start;
                } else {
                    return end;
                }
            }
            
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;  
            }
        }        
        
        return start;
    }
    
}