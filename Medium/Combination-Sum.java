class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        func(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public void func(int i, int[] can, int t, List<List<Integer>> ans, List<Integer> ds ){
        if(i==can.length){
            if(t==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(can[i]<=t){
            ds.add(can[i]);
            func(i,can,t-can[i],ans,ds);
            ds.remove(ds.size()-1);
        }
        func(i+1,can,t,ans,ds);
    }
}