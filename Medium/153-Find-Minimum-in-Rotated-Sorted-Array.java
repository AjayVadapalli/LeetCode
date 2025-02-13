class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low=0,high=n-1;
        int ans=nums[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[low]<=nums[mid]){
                ans = Math.min(ans,nums[low]);
                low=mid+1;
            }else{
                ans = Math.min(ans,nums[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
}