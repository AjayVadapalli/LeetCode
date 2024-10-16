class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int tar=-1;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                tar = nums[i];
                cnt=1;
            }
            else if(nums[i]==tar){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==tar){
                cnt1++;
            }
        }
        if(cnt1>nums.length/2){
            return tar;
        }
        return -1;
    }
}