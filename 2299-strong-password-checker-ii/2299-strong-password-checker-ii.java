class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) {
            return false;
        }
        
        String specials = "!@#$%^&*()-+";
 
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (i != 0 && password.charAt(i - 1) == ch) {
                return false;
            }
            if (!hasLowercase && ch >= 'a' && ch <= 'z') {
                hasLowercase = true;
            }
            if (!hasUppercase  && ch >= 'A' && ch <= 'Z') {
                hasUppercase = true;
            }
            if (!hasSpecialChar && specials.contains(String.valueOf(ch))) {
                hasSpecialChar = true;
            }
            if (!hasDigit && ch >= '0' && ch <= '9') {
                hasDigit = true;
            }
        }
        
        return hasLowercase && hasUppercase && hasSpecialChar && hasDigit;
    }
}