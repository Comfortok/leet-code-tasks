class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) {
            return false;
        }
        
        String lowers = "qwertyuiopasdfghjklzxcvbnm";
        String uppers = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String specials = "!@#$%^&*()-+";
        String digits = "1234567890";
            
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (i != 0 && password.charAt(i - 1) == ch) {
                return false;
            }
            if (!hasLowercase && lowers.contains(String.valueOf(ch))) {
                hasLowercase = true;
            }
            if (!hasUppercase  && uppers.contains(String.valueOf(ch))) {
                hasUppercase = true;
            }
            if (!hasSpecialChar && specials.contains(String.valueOf(ch))) {
                hasSpecialChar = true;
            }
            if (!hasDigit && digits.contains(String.valueOf(ch))) {
                hasDigit = true;
            }
        }
        
        return hasLowercase && hasUppercase && hasSpecialChar && hasDigit;
    }
}