class Solution {
    static void combi(int arr[],int tar,int idx,int sum,List<List<Integer>> result,List<Integer> curr){
        if(sum==tar){
            result.add(new ArrayList<>(curr));
            return;
        }
        if(sum>tar || idx==arr.length) return;
        sum=sum+arr[idx];
        curr.add(arr[idx]);
        combi(arr,tar,idx+1,sum,result,curr);

        sum=sum-arr[idx];
        curr.remove(curr.size()-1);
        while(idx+1 < arr.length && arr[idx]==arr[idx+1]){
            idx++;
        }
        combi(arr,tar,idx+1,sum,result,curr);
    }
    public List<List<Integer>> combinationSum2(int[] arr, int tar) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        combi(arr,tar,0,0,result,curr);
        return result;
    }
}