class Solution {
    static long f(int x) {
        long z = 0;

        while (x != 0) {
            z = z * 10 + x % 10;
            x /= 10;
        }

        return z;
    }

    public int reverse(int x) {
        long ans = f(x);

        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) ans;
    }
}