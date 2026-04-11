class Solution {
    static void f(int arr[][], int[] ind){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(i == ind[0]) arr[i][j]++;
                if(j == ind[1]) arr[i][j]++;
            }
        }
    }
    public int oddCells(int m, int n, int[][] ind) {
        int[][] arr = new int[m][n];

        for(int i = 0; i < ind.length; i++){
            f(arr, ind[i]);
        }

        int count = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] % 2 != 0) count++;
            }
        }

        return count;
    }
}