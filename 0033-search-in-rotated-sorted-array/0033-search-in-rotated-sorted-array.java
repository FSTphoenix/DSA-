class Solution {
    public int search(int[] arr, int k) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
           int mid=i+(j-i)/2;
           if(arr[mid]==k) return mid;
           if(arr[i]<=arr[mid]){
                if(k>=arr[i] && k<=arr[mid]){
                    j=mid-1;
                }
                else i=mid+1;
           }
           else{
                if(k>=arr[mid] && k<=arr[j]){
                    i=mid+1;
                }
                else j=mid-1;
           }
        }

        return -1;
    }
}