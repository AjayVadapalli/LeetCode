class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1,high = maxi(piles);
        int ans = 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(totalhrs(piles,mid)<=h){
                ans = mid;
                high = mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int totalhrs(int[] piles,int mid){
        int total = 0;
        int n = piles.length;
        for(int i=0;i<n;i++){
            total+=Math.ceil((double)piles[i]/(double)mid);
        }
        return total;
    }
    public int maxi(int[] piles){
        int m = piles[0];
        for(int i : piles){
            if(i>m){
                m = i;
            }
        }
        return m;
    }
}