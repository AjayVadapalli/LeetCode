class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        double n=salary.length;
        for(int i=1;i<n-1;i++){
            sum+=salary[i];
        }
        return sum/(n-2);
    }
}