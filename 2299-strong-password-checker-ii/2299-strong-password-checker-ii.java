class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int l = password.length();
        if (l < 8) return false;
        
        String specials = "!@#$%^&*()-+";
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;
        
        for (int i = 0; i < l; i++) {
            char ch = password.charAt(i);
            if (i > 0 && password.charAt(i - 1) == ch) return false;
            if (!hasLowercase) hasLowercase = ch >= 'a' && ch <= 'z';
            if (!hasUppercase) hasUppercase = ch >= 'A' && ch <= 'Z';
            if (!hasSpecialChar) hasSpecialChar = specials.contains(String.valueOf(ch));
            if (!hasDigit) hasDigit = ch >= '0' && ch <= '9';
        }
        
        return hasLowercase && hasUppercase && hasSpecialChar && hasDigit;
    }
}