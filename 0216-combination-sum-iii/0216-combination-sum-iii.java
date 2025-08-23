class Solution {
    static void combi(int k,int n,int num,int sum,List<Integer> curr,List<List<Integer>> result){
        if(curr.size()==k){
            if(sum==n){
                result.add(new ArrayList<>(curr));
                return;
            }
        }
        if(num>9 || sum>n) return;
        curr.add(num);
        sum=sum+num;
        combi(k,n,num+1,sum,curr,result);

        sum=sum-num;
        curr.remove(curr.size()-1);
        combi(k,n,num+1,sum,curr,result);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        combi(k,n,1,0,curr,result);
        return result;
    }
}