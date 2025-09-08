class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int max=0;
        int[] psum = new int[m];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                if (matrix[i][j] == '1') {
                    psum[j] += 1;  
                } else {
                    psum[j] = 0;   
                }
            }
            max = Math.max(max,hist(psum));
        }
        return max;
    }
    public int hist(int[] heights){
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