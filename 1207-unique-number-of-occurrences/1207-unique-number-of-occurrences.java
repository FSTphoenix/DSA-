class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        
        int count = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i - 1]){
                count++;
            } else {
                if(list.contains(count)) return false;
                list.add(count);
                count = 1;
            }
        }

        if(list.contains(count)) return false;
        list.add(count);

        return true;
    }
}