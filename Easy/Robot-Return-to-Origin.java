class Solution {
    public boolean judgeCircle(String moves) {
        int u=0,l=0,r=0,d=0;
        int n = moves.length();
        for(int i=0;i<n;i++){
            if(moves.charAt(i) == 'U'){
                u++;
            }
            if(moves.charAt(i) == 'L'){
                l++;
            }
            if(moves.charAt(i) == 'R'){
                r++;
            }
            if(moves.charAt(i) == 'D'){
                d++;
            }
        }
        if((u==d && d==r && r==l || (u==d && l==r) )){
            return true;
        }
        return false;
    }
}