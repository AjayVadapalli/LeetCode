class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> l = new ArrayList<>();
        int i=0,j=0;
        int n = nums1.length;
        int m = nums2.length;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                l.add(nums1[i]);
                i++;
            }else{
                l.add(nums2[j]);
                j++;
            }
            
        }
        while(i<n){
            l.add(nums1[i]);
            i++;
        }
        while(j<m){
            l.add(nums2[j]);
            j++;
        }
        int x = l.size();
        if(x==2){
            return (double)(l.get(0)+l.get(1))/2;
        }
        if(x%2!=0){
            return (double)l.get(x/2);
        }
        return (double)(l.get(x / 2 - 1) + l.get(x / 2)) / 2;
    }
}