class Solution {
    public int maxStep(int arr[]) {
        int maxAlti =0;
        int cnt = 0;
        for(int i = 1; i<arr.length; i++){
           if(arr[i-1]<arr[i]){
               cnt++;
           }else { 
               cnt = 0;
           } 
           maxAlti = Math.max(cnt,maxAlti);
        }
        return maxAlti;
    }
}