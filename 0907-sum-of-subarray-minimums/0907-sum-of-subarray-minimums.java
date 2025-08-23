class Solution {
    static int[] findNES(int []arr,int n){
        int nsc[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsc[i]=n;
            }
            else{
                nsc[i]=st.peek();
            }
            st.push(i);
        }
        return nsc;
    }
    static int[] findPSEE(int []arr,int n){
        int nsc[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsc[i]=-1;
            }
            else{
                nsc[i]=st.peek();
            }
            st.push(i);
        }
        return nsc;
    }
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] nse = findNES(arr, n);
        int[] pse = findPSEE(arr, n);

        int mod = (int)1e9 + 7;
        long total = 0;

        for (int i = 0; i < n; i++) {
            int left = i - pse[i];
            int right = nse[i] - i;
            total = (total + (long)arr[i] * left * right) % mod;
        }

        return (int) total;
    }
}