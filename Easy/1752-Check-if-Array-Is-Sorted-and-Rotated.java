class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        // Loop through the array and check the condition
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            // If there are more than 1 transitions, return false
            if (count > 1) {
                return false;
            }
        }
        
        return true;
    }
}