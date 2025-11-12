import java.util.*;

class Solution {
    static class Pair {
        int row, col, tm;
        Pair(int row, int col, int tm) {
            this.row = row;
            this.col = col;
            this.tm = tm;
        }
    }

    public int orangesRotting(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int[][] visi = new int[n][m];
        Queue<Pair> q = new LinkedList<>();

        int countfresh = 0;

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                    visi[i][j] = 2;
                } else {
                    visi[i][j] = 0;
                }

                if (arr[i][j] == 1) {
                    countfresh++;
                }
            }
        }

        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};
        int tm = 0;

        
        while (!q.isEmpty()) {
            Pair p = q.remove();
            tm = Math.max(tm, p.tm);

            for (int i = 0; i < 4; i++) {
                int newRow = p.row + dRow[i];
                int newCol = p.col + dCol[i];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m) {
                    
                    if (arr[newRow][newCol] == 1 && visi[newRow][newCol] != 2) {
                        arr[newRow][newCol] = 2;
                        visi[newRow][newCol] = 2;
                        q.add(new Pair(newRow, newCol, p.tm + 1));
                        countfresh--;
                    }
                }
            }
        }

        
        if (countfresh > 0) return -1;

        return tm;
    }
}
