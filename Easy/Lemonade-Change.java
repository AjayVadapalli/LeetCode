class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n= bills.length;
        int f=0,t=0,p=0;
        boolean x=true;
        for(int i=0;i<n;i++){
            if(bills[i]==5){
                f++;
            }
            if(bills[i]==10){
                if(f>=1){
                    f--;
                    t++;
                }else{
                    x=false;
                }
            }
            if(bills[i]==20){
                if(f>=1 && t>=1){
                    f--;
                    t--;
                }
                else if(f>=3){
                    f-=3;
                }
                else{
                    x=false;
                }
            }
        }
        return x;
    }
}