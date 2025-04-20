class Solution {
    public int findDuplicate(int[] arr) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<n-1;i++)
        {
           if(arr[i]==arr[i+1])
           ans = arr[i];
        }
        return ans;
    }
}