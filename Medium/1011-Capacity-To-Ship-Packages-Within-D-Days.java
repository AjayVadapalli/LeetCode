class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = maxi(weights),high = sumi(weights);
        while(low<=high){
            int mid = (low+high)/2;
            if(count(weights,mid)<=days){
                high = mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public int maxi(int[] nums){
        int m = nums[0];
        for(int i : nums){
            if(i>m){
                m=i;
            }
        }
        return m;
    }
    public int sumi(int[] nums){
        int t = 0;
        for(int i : nums){
            t+=i;
        }
        return t;
    }
    public int count(int[] nums,int mid){
        int day =1,load =0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if((nums[i]+load)>mid){
                day++;
                load = nums[i];
            }else{
                load+=nums[i];
            }
        }
        return day;
    }
}