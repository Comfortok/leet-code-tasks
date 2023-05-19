class Solution {
    public String maximumTime(String time) {
        StringBuilder sb = new StringBuilder(time);
        for (int i = 0; i < time.length(); i++) {
            if (time.charAt(i) == '?') {
                switch (i) {
                    case 0: {
                        if (sb.charAt(1) >= '4' && sb.charAt(1) != '?') {
                            sb.replace(i, i + 1, "1");
                        } else {
                            sb.replace(i, i + 1, "2");
                        }
                        break;
                    }
                    case 1: {
                        if (sb.charAt(0) == '2') {
                            sb.replace(i, i + 1, "3");
                        } else {
                            sb.replace(i, i + 1, "9");
                        }
                        break;
                    }
                    case 3: {
                        sb.replace(i, i + 1, "5");
                        break;
                    }
                    case 4: {
                        sb.replace(i, i + 1, "9");
                        break;
                    }
                }
            }
        }
        
        return sb.toString();
    }
}