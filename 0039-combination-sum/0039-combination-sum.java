class Solution {
    static void combi(int []arr,int tar,int sum,int idx,List<Integer> curr,List<List<Integer>> result){
        if(sum==tar){
            result.add(new ArrayList<>(curr));
            return;
        }
        if(idx==arr.length || sum>tar) return;
        curr.add(arr[idx]);
        sum=sum+arr[idx];
        combi(arr,tar,sum,idx,curr,result);
        
        sum=sum-arr[idx];
        curr.remove(curr.size()-1);
        combi(arr,tar,sum,idx+1,curr,result);
    }
    public List<List<Integer>> combinationSum(int[] arr, int tar) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        combi(arr,tar,0,0,curr,result);
        return result;
    }
}