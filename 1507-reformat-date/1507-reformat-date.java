class Solution {
    public String reformatDate(String date) {
        String[] parts = date.split(" ");
        String[] months = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String month = "";
        for (int i = 0; i < months.length; i++) {
            if (months[i].equals(parts[1])) {
                if (i < 9) {
                    month = "0" + (i + 1);
                } else {
                    month = String.valueOf(i + 1);
                }
                break;
            }
        }

        String year = parts[2];
        String day = "";
        if (parts[0].substring(0, 2).toLowerCase().equals(parts[0].substring(0, 2).toUpperCase())) {
            day = parts[0].substring(0, 2);
        } else {
            day = parts[0].substring(0, 1);
        }
        if (Integer.parseInt(day) < 10) {
            day = "0" + day;
        }

        return year + "-" + month + "-" + day;
    }
}