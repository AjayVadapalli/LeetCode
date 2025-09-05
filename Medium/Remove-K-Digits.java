import java.util.*;

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();
        int n = num.length();

        for (int i = 0; i < n; i++) {
            while (!s.empty() && k > 0 && s.peek() > num.charAt(i)) {
                s.pop();
                k--;
            }
            s.push(num.charAt(i));
        }

        while (k > 0 && !s.empty()) {
            s.pop();
            k--;
        }

        StringBuilder res = new StringBuilder();
        while (!s.empty()) {
            res.append(s.pop());
        }

        res.reverse();

        int idx = 0;
        while (idx < res.length() && res.charAt(idx) == '0') {
            idx++;
        }

        String ans = (idx == res.length()) ? "0" : res.substring(idx);
        return ans;
    }
}
