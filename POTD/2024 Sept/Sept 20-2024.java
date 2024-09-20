class Solution {
    public int countBuildings(int[] arr) {
      int prev=arr[0];
      int cnt=1;
      for(int i=1;i<arr.length;i++) {
          if(arr[i]>prev) {
              prev=arr[i];
              cnt++;
          }
      }
      return cnt;
    }
}