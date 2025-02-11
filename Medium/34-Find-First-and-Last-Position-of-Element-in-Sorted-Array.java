class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(first(nums,target)==-1) return new int[]{-1,-1};
        return new int[]{first(nums,target),last(nums,target)};
    }
    public int first(int[] nums,int x){
        int n = nums.length;
        int low = 0,high=n-1;
        int f=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] ==x){
                f=mid;
                high = mid-1;
            } 
            else if(x>nums[mid]) low = mid+1;
            else high = mid-1;
        }
        return f;
    }
    public int last(int[] nums,int x){
        int n = nums.length;
        int low = 0,high=n-1;
        int l = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] ==x) {
                l = mid;
                low = mid+1;
            }
            else if(x>nums[mid]) low = mid+1;
            else high = mid-1;
        }
        return l;
    }
}