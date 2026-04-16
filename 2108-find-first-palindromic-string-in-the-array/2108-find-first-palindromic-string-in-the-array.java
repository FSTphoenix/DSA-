class Solution {
    public String firstPalindrome(String[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(isPal(arr[i])) return arr[i];
        }
        return "";
    }

    boolean isPal(String s){
        int l = 0, r = s.length() - 1;

        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}