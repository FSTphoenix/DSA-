class Solution {
    public int[][] flipAndInvertImage(int[][] nums) {
        int [][] arr=new int[nums.length][nums[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=nums[i][arr[0].length-j-1];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1) arr[i][j]=0;
                else arr[i][j]=1;
            }
        }

        return arr;
    }
}