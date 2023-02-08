class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int days = day - 1;
        for (int i = 1971; i < year; i++) {
            if (isLeap(i)) {
                days += 366;
            } else {
                days += 365;
            }
        }
        
        for (int i = 1; i < month; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                days += 31;
            } else if (i == 2) {
                if (isLeap(year)) {
                    days += 29;
                } else {
                    days += 28;
                }
            } else {
                days += 30;
            }
        }
        
        String result;
        days = days % 7;
        switch (days) {
            case 0: result = "Friday"; break;
            case 1: result = "Saturday"; break;
            case 2: result = "Sunday"; break;
            case 3: result = "Monday"; break;
            case 4: result = "Tuesday"; break;
            case 5: result = "Wednesday"; break;
            default: result = "Thursday"; break;
        }
        
        return result;
    }
    
    private boolean isLeap(int year) {
        boolean result = false;
        if (year % 100 == 0) {
            result = year % 400 == 0 ? true : false;
        } else if (year % 4 == 0) {
            result = true;
        }
        
        return result;
    }
}