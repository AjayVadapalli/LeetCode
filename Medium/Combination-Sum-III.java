class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        func(0,k,n,nums,ans,new ArrayList<>());
        return ans;
    }
    public void func(int ind, int k, int n, int[] nums, List<List<Integer>> ans, List<Integer> ds ){
        if(k==0 && n==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<nums.length;i++){
            ds.add(nums[i]);
            func(i+1,k-1,n-nums[i],nums,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}