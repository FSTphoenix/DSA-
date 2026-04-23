class Solution {
    static boolean f(int x){
        int n=x;
        while(n!=0){
            int y=n%10;
            if(y==0 || x%y!=0) return false;
            n=n/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for(int i=l;i<=r;i++){
            if(f(i)) list.add(i);
        }
        return list;
    }
}