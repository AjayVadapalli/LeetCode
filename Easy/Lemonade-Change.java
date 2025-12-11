1class Solution {
2    public boolean lemonadeChange(int[] bills) {
3        int five=0;
4        int ten=0;
5        boolean bool=true;
6        for(int i=0;i<bills.length;i++){
7            if(bills[i]==5) five+=1;
8            else if(bills[i]==10){
9                if(five>=1){
10                    five--;
11                    ten++;
12                }
13                else bool= false;
14            }
15            else{
16                if(five>=1 && ten>=1){
17                    five--;
18                    ten--;
19                }
20                else if(five>=3){
21                    five-=3;
22                }
23                else bool= false;
24            }
25        }
26        return bool;
27    }
28}