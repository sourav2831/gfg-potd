class Solution {
    public void sort012(int[] arr) {
        int l = 0, mid = 0, h = arr.length - 1;
        while (mid <= h) {
            if (arr[mid] == 0) {
                swap(arr, l, mid);
                l++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, h);
                h--;
            }
        }
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}