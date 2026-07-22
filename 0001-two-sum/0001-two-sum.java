class Solution {
    public int[] twoSum(int[] arr, int tar) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int rem = tar - arr[i];

            if(map.containsKey(rem)){
                return new int[]{map.get(rem), i};
            }

            map.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }
}