class Solution {
    public boolean isPalindrome(String s) {
        String cleanedStr = s.replaceAll(\[^a-zA-Z0-9]\, \\).toLowerCase();
        int length = cleanedStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedStr.charAt(i) != cleanedStr.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
        
        
    }
}