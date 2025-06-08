import java.util.Hashtable;
class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        Hashtable<Character, Integer> h = new Hashtable<>();
        Hashtable<Character, Integer> x = new Hashtable<>();

        for(int i=0;i<n;i++){
           h.put(s.charAt(i), h.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i=0;i<m;i++){
            x.put(t.charAt(i), x.getOrDefault(t.charAt(i), 0) + 1);
        }
        if(h.equals(x)){
            return true;
        }
        return false;
    }
}