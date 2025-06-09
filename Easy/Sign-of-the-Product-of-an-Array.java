class Solution {
    public int arraySign(int[] nums) {
        int n = nums.length;
        double x = 1;
        for(int i : nums){
            x*=i;
        }
        return signFunc(x);
    }
    public int signFunc(double x){
        if(x>0){
            return 1;
        }
        if(x<0){
            return -1;
        }
        return 0;
    }
}