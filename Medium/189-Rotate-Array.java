class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reversee(nums,0,n-1);
        reversee(nums,0,k-1);
        reversee(nums,k,n-1);
    }
    private void reversee(int[] nums,int s,int e){
            while(s<e){
                int temp =nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
}