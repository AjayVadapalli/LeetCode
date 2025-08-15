class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            ds.add(new String(row));
        }
        int[] left = new int[n];
        int[] upper = new int[2*n-1];
        int[] lower = new int[2*n-1];
        Arrays.fill(left,0);
        Arrays.fill(upper,0);
        Arrays.fill(lower,0);
        solve(0,ds,res,left,upper,lower,n);
        return res;
    }
    public void solve(int j, List<String> ds, List<List<String>> res, int[] left, int[] upper, int[] lower,int n){
        if(j==n){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<n;i++){
            if(left[i]==0 && upper[n-1+j-i]==0 && lower[i+j]==0){
                String newRow = ds.get(i).substring(0, j) + "Q" + ds.get(i).substring(j + 1);
                ds.set(i, newRow);
                left[i]=1;
                upper[n-1+j-i]=1;
                lower[i+j]=1;
                solve(j+1,ds,res,left,upper,lower,n);
                newRow = ds.get(i).substring(0, j) + "." + ds.get(i).substring(j + 1);
                ds.set(i, newRow);
                left[i]=0;
                upper[n-1+j-i]=0;
                lower[i+j]=0;
            }
        }
    }
}