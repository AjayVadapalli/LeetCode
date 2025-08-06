class Solution {
    static final int MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long odd = n/2;
        long even = n/2 + n%2;
        return (int)(power(5,even)*power(4,odd)%MOD);
    }
    public long power(long x, long n) {
        long ans = 1;
        long nn = n;
        x = x % MOD;
        if(nn<0) nn = -1 * nn;
        while(nn>0){
            if(nn%2==1){
                ans = (ans *x)% MOD;
                nn = nn-1;
            }else{
                x = (x*x)% MOD;
                nn = nn/2;
            }
        }
        if(n<0) ans = (long)(1.0)/(long)(ans);
        return ans;
    }
}