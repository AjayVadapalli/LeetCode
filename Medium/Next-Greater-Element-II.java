class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n= nums.length;
        Stack<Integer> s = new Stack<>();
        int[] num = new int[n];
        for(int i=(2*n)-1;i>=0;i--){
            while(!s.empty() && s.peek()<=nums[i%n]){
                s.pop();
            }
            if(i<n){
                num[i] = s.empty() ? -1 : s.peek();
            }
            s.push(nums[i%n]);
        }
        return num;
    }
}