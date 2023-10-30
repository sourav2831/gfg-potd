//Move all zeroes to end of array

class Solution {
    void pushZerosToEnd(int arr[], int n) {
        int i=0;
        int j=1;
        while(i<n-1 && j<n){
            if(arr[i] == 0 && arr[j] != 0){
                swap(arr,i,j) ;
                i++;
                j++;
            }
            else if(arr[i]!=0 && arr[j] == 0){
                i++;
                j++;
            }
            else if(arr[i] != 0 && arr[j] != 0){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
    }
    void swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
