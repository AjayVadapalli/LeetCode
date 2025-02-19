class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((long) m * k > n) return -1;
        int low = mini(bloomDay),high = maxi(bloomDay);
        while(low<=high){
            int mid = (low+high)/2;
            if(possible(bloomDay,mid,m,k)==true){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public boolean possible(int[] arr,int day,int m,int k){
        int n = arr.length;
        int t = 0;
        int cnt= 0;
        for(int i=0;i<n;i++){
            if(arr[i]<=day){
                cnt++;
            }else{
                t += (cnt/k);
                cnt=0;
            }
        }
        t +=(cnt/k);
        if(t>=m) return true;
        else return false;
    }
    public int mini(int[] arr){
        int n = arr.length;
        int m = arr[0];
        for(int i : arr){
            if(i<m){
                m = i;
            }
        }
        return m;
    }
    public int maxi(int[] arr){
        int n = arr.length;
        int m = arr[0];
        for(int i : arr){
            if(i>m){
                m = i;
            }
        }
        return m;
    }
}