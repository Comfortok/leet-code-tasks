/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int mid = n / 2;
        return getFirstBadVersion(mid, n);
    }
    
    @Override
    public boolean isBadVersion(int version) {
        return super.isBadVersion(version);
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
            result = getFirstBadVersion((int) (((long) mid + (long) n) / 2), n);
        }
        
        return result;
    }
}