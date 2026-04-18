class Solution {
    public int numberOfMatches(int n) {
        int m=0,sum=0;
        while(n>1){
            if(n%2==0){
                m=n/2;
                n=n/2;
                sum+=m;
            }
            else{
                m=(n-1)/2;
                n=m+1;
                sum+=m;
            }
        }
        return sum;
    }
}