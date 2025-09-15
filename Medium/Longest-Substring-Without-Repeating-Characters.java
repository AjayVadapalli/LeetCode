class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> m = new HashMap<>(256);
        for (int i = 0; i < 256; i++) {
            m.put((char) i, -1);
        }
        int l=0,r=0;
        int n = s.length();
        int max=0;
        while(r<n){
            if(m.get(s.charAt(r))>=l){
                l = m.get(s.charAt(r))+1;
            }
            int len = r-l+1;
            max = Math.max(max,len);
            m.put(s.charAt(r),r);
            r++;
        }
        return max;
    }
}