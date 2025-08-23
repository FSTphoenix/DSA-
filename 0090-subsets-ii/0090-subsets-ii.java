class Solution {
    static void sub(int arr[],int idx,List<List<Integer>> result,List<Integer> curr){
        if(idx==arr.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr[idx]);
        sub(arr,idx+1,result,curr);
        while(idx+1<arr.length && arr[idx]==arr[idx+1]){
            idx++;
        }
        curr.remove(curr.size()-1);
        sub(arr,idx+1,result,curr);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        sub(nums,0,result,curr);
        return result;
    }
}