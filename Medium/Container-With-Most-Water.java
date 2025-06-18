class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i=0,j=n-1;
        int a = 0,b;
        while(i<j){
            if(height[i]<height[j]){
               b = (j-i)*height[i];
               i++;
            }else{
               b = (j-i)*height[j];
               j--;
            }
            if(b>a){
                a=b;
            }
            
        }
        return a;
    }
}