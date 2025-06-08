class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int len = 1; len <= n / 2; len++) {
        if (n % len == 0) {  // substring length divides total length exactly
            String sub = s.substring(0, len);
            StringBuilder repeated = new StringBuilder();
            
            int times = n / len;
            for (int i = 0; i < times; i++) {
                repeated.append(sub);
            }
            
            if (repeated.toString().equals(s)) {
                return true;
            }
        }
    }
        return false;
    }
}