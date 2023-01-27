/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end-start) / 2;
            if (!isBadVersion(mid)) {
                start = mid + 1;
            } else {
                end = mid;            
            }
        }        
        
        return start;
        // int mid = n / 2;
        // return getFirstBadVersion(mid, n);
    }
    
    public int getFirstBadVersion(int mid, int n) {
        if (n - mid < 2) {
            if (isBadVersion(mid)) {
                return mid;
            } else {
                return n;
            }
        }
        
        int result;
        if (isBadVersion(mid)) {
            result = getFirstBadVersion(mid / 2, mid);
        } else {
            result = getFirstBadVersion(mid + ((n - mid) / 2), n);
        }
        
        return result;
    }
}