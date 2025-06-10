class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int x=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i) != ' '){
                x++;
            }
            if(s.charAt(i)== ' ' && x>0){
                break;
            }
        }
        return x;
    }
}