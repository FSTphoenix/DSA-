class Solution {
    static int[][] dp;
    static int[][] arr1;

    static int f(int i, int j){
        if(j < 0 || j >= arr1[i].length) return Integer.MAX_VALUE; // 🔥 stop invalid paths
        if(i == arr1.length - 1) return arr1[i][j];
        if(dp[i][j] != -1) return dp[i][j];

        int d = arr1[i][j] + f(i+1, j);
        int dg = arr1[i][j] + f(i+1, j+1);

        return dp[i][j] = Math.min(d, dg);
    }

    public int minimumTotal(List<List<Integer>> triangle) {

        int[][] arr = new int[triangle.size()][];

        for(int i = 0; i < triangle.size(); i++){
            arr[i] = new int[triangle.get(i).size()];
            for(int j = 0; j < triangle.get(i).size(); j++){
                arr[i][j] = triangle.get(i).get(j);
            }
        }

        dp = new int[arr.length][];
        for(int i = 0; i < arr.length; i++){
            dp[i] = new int[arr[i].length];
            for(int j = 0; j < arr[i].length; j++){
                dp[i][j] = -1;
            }
        }

        arr1 = arr;
        return f(0, 0);
    }
}
