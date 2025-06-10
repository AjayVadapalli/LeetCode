class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> l = new ArrayList<>();
        int n = operations.length;
        int x=0;
        for(int i=0;i<n;i++){
            String op = operations[i];
            if(op.equals("+")){
                l.add(l.get(l.size()-1)+l.get(l.size()-2));
            }else if(op.equals("D")){
                l.add(2*l.get(l.size()-1));
            }else if(op.equals("C")){
                l.remove(l.size()-1);
            }else{
                int y = Integer.parseInt(op);
                l.add(y);
            }
        }
        for(int i : l){
            x+=i;
        }
        return x;

    }
}