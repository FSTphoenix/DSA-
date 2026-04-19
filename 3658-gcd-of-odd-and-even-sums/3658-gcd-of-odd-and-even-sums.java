class Solution {
    static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int odd = n * n;
        int even = n * (n + 1);

        return gcd(odd, even);
    }
}