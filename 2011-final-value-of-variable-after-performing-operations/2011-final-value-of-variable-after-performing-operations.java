class Solution {
    public int finalValueAfterOperations(String[] arr) {
         int x = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i].contains("+")) x++;
            else x--;
        }

        return x;
    }
}