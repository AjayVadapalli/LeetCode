1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        int n = g.length;
4        int m = s.length;
5        Arrays.sort(g);
6        Arrays.sort(s);
7        int l=0,r=0;
8        while(r<n && l<m){
9            if(g[r]<=s[l]){
10                r+=1;
11            }
12            l+=1;
13        }
14        return r;
15    }
16}