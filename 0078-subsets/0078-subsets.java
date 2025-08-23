class Solution {
    static void subset(int []arr,int idx,List<Integer> current,List<List<Integer>> result){
        if(idx==arr.length){
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(arr[idx]);
        subset(arr,idx+1,current,result);
        current.remove(current.size()-1);
        subset(arr,idx+1,current,result);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current= new ArrayList<>();
        subset(nums,0,current,result);
        return result;
    }
}