//Minimize the Heights II

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        int i=1;
        while(i<n){
            if(arr[i]-k<0){
                i++;
                continue;
            }
            int min=Math.min(arr[i]-k,arr[0]+k);
            int max=Math.max(arr[n-1]-k,arr[i-1]+k);
            ans=Math.min(ans,max-min);
            i++;
        }
        return ans;
    }
}