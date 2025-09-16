class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l=0,r=0;
        int max = 0;
        int z=0;
        while(r<n){
            if(nums[r]==0){
                z++;
            }
            if(z>k){
                if(nums[l]==0){
                    z--;
                }
                l++;
            }
            int len = r - l + 1;
            max = Math.max(max, len);
            
            r++;
            
        }
        return max;
    }
}