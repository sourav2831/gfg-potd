class Solution {
    void segregate0and1(int[] arr) {
     int low=0;
     int high=arr.length-1;
     while(low<=high){
         if(arr[low]==0){
             low++;
         }
        else if(arr[high]==1){
             high--;
         }
         else{
             int temp=arr[high];
              arr[high]=arr[low];
             arr[low]=temp;
             low++;
             high--;
         }
     }
     
    }
}