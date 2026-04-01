class Solution {
    static boolean row(int[][] arr, int n, int i){
        for(int k = 0; k < arr[0].length; k++){
            if(arr[i][k] < n) return false; 
        }
        return true;
    }

    static boolean col(int[][] arr, int n, int j){
        for(int k = 0; k < arr.length; k++){
            if(arr[k][j] > n) return false; 
        }
        return true;
    }
    public List<Integer> luckyNumbers(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(row(arr,arr[i][j],i) && col(arr,arr[i][j],j)){
                    list.add(arr[i][j]);
                }
            }
        }
        return list;
    }
}