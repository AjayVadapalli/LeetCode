class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        func(0,s,res,ds);
        return res;
    }
    public void func(int ind, String s, List<List<String>> res, List<String> ds){
        if(ind==s.length()){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(isPal(s,ind,i)){
                ds.add(s.substring(ind,i+1));
                func(i+1,s,res,ds);
                ds.remove(ds.size()-1);
            }
        }
    }
    public boolean isPal(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }return true;
    }
}