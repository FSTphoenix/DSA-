class Solution {
    static int[] findnse(int arr[]){
        int nse[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=arr.length;
            }else{
                nse[i]=st.peek();
            }
            st.push(i);
        }
        return nse;
    }
    static int[] findpse(int arr[]){
        int pse[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }else{
                pse[i]=st.peek();
            }
            st.push(i);
        }
        return pse;
    }
    static long summin(int []arr){
        int []NSE=findnse(arr);
        int []PSE=findpse(arr);
        long total = 0;

        for (int i = 0; i < arr.length; i++) {
            int left = i - PSE[i];
            int right = NSE[i] - i;
            total += (long)arr[i] * left * right;
        }

        return total;
    }
    static int[] findnge(int []arr){
        int nge[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i]=arr.length;
            }else{
                nge[i]=st.peek();
            }
            st.push(i);
        }
        return nge;
    }

    static int[] findpge(int []arr){
        int pge[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pge[i]=-1;
            }else{
                pge[i]=st.peek();
            }
            st.push(i);
        }
        return pge;
    }
    static long summax(int []arr){
        int []NGE=findnge(arr);
        int []PGE=findpge(arr);
       
        long total = 0;

        for (int i = 0; i < arr.length; i++) {
            int left = i - PGE[i];
            int right = NGE[i] - i;
            total += (long)arr[i] * left * right;
        }

        return total;
    }
    public long subArrayRanges(int[] nums) {
        long summin=summin(nums);
        long summax=summax(nums);
        return (long)summax-summin;
    }
}