class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int low = 0,high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            int miss = arr[mid] - (mid+1);
            if(miss<k){
                low = mid+1;
            }else{
                high=mid-1;
            }
        }
        return low+k;
    }
}