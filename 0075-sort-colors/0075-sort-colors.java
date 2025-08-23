class Solution {
    private void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public void sortColors(int[] arr) {
       int start=0,mid=0,end=arr.length-1;
       while(mid<=end){
        switch(arr[mid]){
            case 0:
            swap(arr,start,mid);
            mid++;
            start++;
            break;

            case 1:
            mid++;
            break;

            case 2:
            swap(arr,mid,end);
            end--;
            break;
        }
       }
    }
}
