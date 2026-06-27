class Solution {
    public int maxNumberOfBalloons(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int arr[]=new int[5];
        arr[0]=1;
        arr[1]=1;
        arr[2]=2;
        arr[3]=1;
        arr[4]=2;

        int count=0;
        while(map.getOrDefault('a', 0) >= arr[0] &&
      map.getOrDefault('b', 0) >= arr[1] &&
      map.getOrDefault('l', 0) >= arr[2] &&
      map.getOrDefault('n', 0) >= arr[3] &&
      map.getOrDefault('o', 0) >= arr[4]){
            arr[0]+=1;
            arr[1]+=1;
            arr[2]+=2;
            arr[3]+=1;
            arr[4]+=2;

            count++;
        }
        return count;
    }
}