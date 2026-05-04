class Solution {
    public List<Integer> findMissingElements(int[] nums) {
         List<Integer> list = new ArrayList<>();

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int x : nums){
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        HashSet<Integer> set = new HashSet<>();
        for(int x : nums) set.add(x);

        for(int i = min; i <= max; i++){
            if(!set.contains(i)) list.add(i);
        }

        return list;
    }
}