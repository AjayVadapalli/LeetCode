1class Solution {
2    public int jump(int[] nums) {
3        int jumps = 0;
4        int l=0,r=0;
5        while(r<nums.length-1){
6            int far = 0;
7            for(int j=l;j<=r;j++){
8                far = Math.max(nums[j]+j,far);
9            }
10            jumps++;
11            l = r+1;
12            r = far;
13        }
14        return jumps;
15    }
16}