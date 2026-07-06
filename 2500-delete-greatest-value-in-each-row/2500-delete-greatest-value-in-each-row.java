class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }

        int sum = 0;

        for(int j = 0; j < grid[0].length; j++) {

            int max = 0;

            for(int i = 0; i < grid.length; i++) {
                max = Math.max(max, grid[i][j]);
            }

            sum += max;
        }

        return sum;
    }
}