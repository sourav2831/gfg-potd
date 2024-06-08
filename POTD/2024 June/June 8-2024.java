//Index of an Extra Element

class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        // add code here.
        int start = 0;
        int end = arr2.length-1;
        int ans = n-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr1[mid] != arr2[mid]){
                ans = mid;
            }
            if(arr1[mid] == arr2[mid]){
                start = mid+1;
            }
            else if(arr1[mid] < arr2[mid]){
                end = mid-1;
            }
        }
        return ans;
        
    }
}