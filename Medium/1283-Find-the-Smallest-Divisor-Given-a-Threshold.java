class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low= 1,high = maxi(nums);
        while(low<=high){
            int mid = (low+high)/2;
            if(thresh(nums,mid)<=threshold){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public int maxi(int[] nums){
        int m = nums[0];
        for(int i : nums){
            if(i>m){
                m = i;
            }
        }
        return m;
    }
    public int thresh(int[] nums,int mid){
        int t = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            t+=Math.ceil((double)nums[i]/(double)mid);
        }
        return t;
    }
}