class Solution {
    static double f(double x, int n){
        if(n==0) return 1;
        if(x==0) return 0;

        double y=f(x,n/2);
        y=y*y;

        if(n%2==0) return y;
        else return y*x;
    }
    public double myPow(double x, int n) {
        if(n<0) return 1/f(x,Math.abs(n));
        return f(x,Math.abs(n));
    }
}