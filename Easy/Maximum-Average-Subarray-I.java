1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int n = nums.length;
4        double avg = -Double.MAX_VALUE;
5        for(int i=0;i<=n-k;i++){
6            int cnt=k;
7            int sum=0;
8            int j=i;
9            while(j<n && cnt>0){
10                sum+=nums[j];
11                cnt--;
12                j++;
13            }
14            avg = Math.max(avg,(double)sum/k);
15        }
16        return avg;
17    }
18}