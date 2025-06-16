class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int n = str.length();
        int i=0,j=n-1;
        while(i<=j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;

    }
}