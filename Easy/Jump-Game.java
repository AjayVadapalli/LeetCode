1class Solution {
2    public boolean canJump(int[] nums) {
3        int n = nums.length;
4        int max = 0;
5        for(int i=0;i<n;i++){
6            if(i>max) return false;
7            else{
8                max = Math.max(max,nums[i]+i);
9            }
10        }
11        return true;
12    }
13}