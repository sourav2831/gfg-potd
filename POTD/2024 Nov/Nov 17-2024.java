 class Solution {
    public void reverseArray(int arr[]) {
        int n = arr.length;
        int arr1[] = arr.clone();
        for(int i=0; i<n; i++) {
            arr[i] = arr1[n-i-1];
        }
    }
}   