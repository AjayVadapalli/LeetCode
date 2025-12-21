1class Solution {
2    public int countGoodSubstrings(String s) {
3        if(s.length()<3) return 0;
4        int cnt=0;
5        for(int i=0;i<s.length()-2;i++){
6            char x = s.charAt(i);
7            char y = s.charAt(i+1);
8            char z = s.charAt(i+2);
9            if(x!=y && y!=z && x!=z ){
10                cnt++;
11            }
12        }
13        return cnt;
14
15    }
16}