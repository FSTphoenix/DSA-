class Solution {
    public int totalMoney(int n) {
        int sum=0,d=1,m=1,i=1;
        while(n!=0){
            if(d<=7){
                sum+=i;
                i++;
                d++;
                n--;
            }
            else{
                d=1;
                m++;
                i=m;
            }

        }
        return sum;
    }
}