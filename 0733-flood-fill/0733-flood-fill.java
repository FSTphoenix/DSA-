import java.util.*;

class Solution {

    static class Pair {
        int row, col;
        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    static void bfs(int[][] image, int sr, int sc, int color, int oldColor) {
        int n = image.length;
        int m = image[0].length;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr, sc));
        image[sr][sc] = color; 

       
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};

        while (!q.isEmpty()) {
            Pair p = q.remove();

            for (int i = 0; i < 4; i++) {
                int newRow = p.row + dRow[i];
                int newCol = p.col + dCol[i];

                
                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m) {
                  
                    if (image[newRow][newCol] == oldColor) {
                        image[newRow][newCol] = color;
                        q.add(new Pair(newRow, newCol));
                    }
                }
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if (oldColor == color) return image; 

        bfs(image, sr, sc, color, oldColor);
        return image;
    }
}
