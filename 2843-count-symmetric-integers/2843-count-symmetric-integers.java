class Solution {

    boolean check(int n) {
        String s = String.valueOf(n);

        if(s.length() % 2 != 0) return false;

        int sum1 = 0, sum2 = 0;
        int mid = s.length() / 2;

        for(int i = 0; i < mid; i++) {
            sum1 += s.charAt(i) - '0';
        }

        for(int i = mid; i < s.length(); i++) {
            sum2 += s.charAt(i) - '0';
        }

        return sum1 == sum2;
    }

    public int countSymmetricIntegers(int low, int high) {

        int count = 0;

        for(int i = low; i <= high; i++) {
            if(check(i)) count++;
        }

        return count;
    }
}