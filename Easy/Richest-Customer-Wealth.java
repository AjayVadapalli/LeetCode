class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int max=accounts[0][0];
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
                if(sum>max){
                    max = sum;
                }
            }
            sum=0;
        }
        return max;
    }
}