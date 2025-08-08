class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res,n,0,0,"");
        return res;
    }
    public void backtrack(List<String> res,int n,int open,int close,String cur){
        if(cur.length()==n*2){
            res.add(cur);
            return ;
        }
        if(open<n){
            backtrack(res,n,open+1,close,cur+"(");
        }
        if(close<open){
            backtrack(res,n,open,close+1,cur+")");
        }
    }
}