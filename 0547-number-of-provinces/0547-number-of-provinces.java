class Solution {
    static List<List<Integer>> adj;

    static void dfs(int node,boolean[] visi){
        visi[node]=true;
        for(int nab: adj.get(node)){
            if (!visi[nab]) {
                dfs(nab, visi); 
            }
        }
    }
    public int findCircleNum(int[][] arr) {
        adj=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==1){
                    adj.get(i).add(j);
                }
            }
        }

        boolean[] visi=new boolean[arr.length];
        
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(!visi[i]){
                dfs(i,visi);
                count++;
            }
        }

        return count;
    }
}