class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        int max =0;
        for(int i=0;i<n;i++){
            while(!s.empty() && heights[s.peek()] > heights[i]){
                int ele = s.peek();
                s.pop();
                int nse = i;
                int pse = s.empty() ? -1 : s.peek();
                max = Math.max(heights[ele] * (nse-pse-1) , max);
            }
            s.push(i);
        }
        while(!s.empty()){
            int nse = n;
            int ele = s.peek();
            s.pop();
            int pse = s.empty() ? -1 : s.peek();
            max = Math.max(heights[ele] * (nse-pse-1) , max);
        }
        return max;
    }
}