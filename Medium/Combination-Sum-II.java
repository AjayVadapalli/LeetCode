class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        func(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
    public void func(int ind, int[] can, int t, List<List<Integer>> ans, List<Integer> ds){
        if(t==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<can.length;i++){
            if(i>ind && can[i]==can[i-1]) continue;
            if(can[i]>t) break;
            ds.add(can[i]);
            func(i+1, can,t-can[i],ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}