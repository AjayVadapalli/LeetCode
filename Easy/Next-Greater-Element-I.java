import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums2.length;
        int n = nums1.length;
        Stack<Integer> s = new Stack<>();
        int[] r = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=m-1;i>=0;i--){
            int num = nums2[i];
            while(!s.empty() && s.peek()<num){
                s.pop();
            }
            if(s.empty()){
                map.put(num,-1);
            }else{
                map.put(num,s.peek());
            }
            s.push(num);
        }
        for(int i=0;i<n;i++){
            r[i] = map.get(nums1[i]);
        }
        return r;
    }
}