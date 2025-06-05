class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(nums[i]);
        }
        if(s.size()==n){
            return false;
        }
        return true;
    }
}