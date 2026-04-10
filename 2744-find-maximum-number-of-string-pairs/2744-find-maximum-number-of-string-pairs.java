class Solution {
    public int maximumNumberOfStringPairs(String[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                String rev = new StringBuilder(arr[j]).reverse().toString();
                if(arr[i].equals(rev)) count++;
            }
        }
        return count;
    }
}