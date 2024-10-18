class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr =new int[n];
        int pos = 0,neg = 1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                arr[pos] = nums[i];
                pos=pos+2;
            }
            else{
                arr[neg]=nums[i];
                neg = neg+2;
            }
        }
        return arr;
    }
}