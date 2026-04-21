class Solution {
    public int[] frequencySort(int[] arr) {
         HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(temp, (a, b) -> {
            if(map.get(a).equals(map.get(b)))
                return b - a; // value desc
            return map.get(a) - map.get(b); // freq asc
        });

        for(int i = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }

        return arr;
    }
}