//Three way partitioning

class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b)
    {
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]<a){
                swap(arr,mid,low);
                low++;
                mid++;
            }else if(arr[mid]>=a && arr[mid]<=b){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}