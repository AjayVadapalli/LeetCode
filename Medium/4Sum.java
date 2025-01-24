class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i !=0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j!= i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int l = n-1;
                while(k<l){
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum ==target){
                        List<Integer> t = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        a.add(t);
                        k++;
                        l--;
                        while(k<l && nums[k] == nums[k-1]) k++;
                        while(k<l && nums[l] == nums[l+1]) l--;
                    }
                    else if(sum < target) k++;
                    else l--;
                }
            }
        }
        return a;
    }
}
