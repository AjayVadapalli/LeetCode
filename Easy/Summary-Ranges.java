class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> a = new ArrayList<>();
        int n= nums.length;
        int i=0;
        while(i<n){
            int x = i;
            while(i + 1 < n && nums[i + 1] == nums[i] + 1){
                i++;
            }
            if(x==i){
                a.add(nums[i]+"");
            }else{
                a.add(nums[x]+"->"+nums[i]);
            }
            i++;
        }
        return a;
    }
}