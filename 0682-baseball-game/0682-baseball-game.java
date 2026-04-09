class Solution {
    public int calPoints(String[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("+"))
                list.add(list.get(list.size()-1) + list.get(list.size()-2));
            
            else if(arr[i].equals("D"))
                list.add(2 * list.get(list.size()-1));
            
            else if(arr[i].equals("C"))
                list.remove(list.size()-1);
            
            else
                list.add(Integer.valueOf(arr[i]));
        }

        int sum = 0;
        for(int num : list) sum += num;

        return sum;
    }
}