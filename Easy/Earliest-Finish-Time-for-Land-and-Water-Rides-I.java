class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int ls = landStartTime[i];
                int ld = ls+landDuration[i];
                int ws = Math.max(waterStartTime[j],ld);
                int wd = ws+waterDuration[j];
                min = Math.min(min,wd);

                int wst = waterStartTime[j];
                int wed = wst + waterDuration[j];
                int lst = Math.max(landStartTime[i],wed);
                int led = lst + landDuration[i];
                min = Math.min(min,led);
            }
        }
        return min;
    }
}