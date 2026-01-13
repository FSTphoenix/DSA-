class Solution {
    public int thirdMax(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }

        if(list.size() < 3) return list.get(list.size() - 1);
        return list.get(list.size() - 3);
    }
}
