class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] arr = new int[k];
        int[] strength = new int[k];

        Arrays.fill(strength, Integer.MAX_VALUE);

        for(int i = 0; i < mat.length; i++){
            int count = 0;

            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1) count++;
            }

            for(int n = 0; n < k; n++){
                if(count < strength[n]){
                    
                    
                    for(int m = k-1; m > n; m--){
                        strength[m] = strength[m-1];
                        arr[m] = arr[m-1];
                    }

                    strength[n] = count;
                    arr[n] = i;
                    break;
                }
            }
        }
        return arr;
    }
}