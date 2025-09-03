class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        int n = asteroids.length;
        for(int i=0;i<n;i++){
            if(asteroids[i]>0) s.push(asteroids[i]);
            else{
                while(!s.empty() && Math.abs(asteroids[i])>s.peek() && s.peek()>0){
                    s.pop();
                }
                if(!s.empty() && s.peek()==Math.abs(asteroids[i])){
                    s.pop();
                }else if(s.empty() || s.peek()<0){
                    s.push(asteroids[i]);
                }
            }
        }
        int m = s.size();
        int[] num = new int[m];
        for (int i = m - 1; i >= 0; i--) {
            num[i] = s.pop();
        }

        return num;
    }
}