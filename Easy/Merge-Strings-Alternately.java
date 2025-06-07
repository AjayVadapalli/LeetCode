class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int i=0,j=0;
        StringBuilder sb = new StringBuilder();
        while(i<n){
            sb.append(word1.charAt(i));
            while(j<m){
                sb.append(word2.charAt(i));
                j++;
                break;
            }
            i++;
        }
        while(i<n){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j<m){
            sb.append(word2.charAt(j));
            j++;
        }
        
        return sb.toString();
    }
}