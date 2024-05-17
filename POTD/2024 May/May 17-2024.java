//Find Pair Given Difference

class Solution {
    public int findPair(int n, int x, int[] arr) {
        Arrays.sort(arr);
        int i=0,j=1;
        while(i<n && j<n) {
            if(Math.abs(arr[j]-arr[i])==x && i!=j)
            return 1;
            if(arr[j]-arr[i]>x)
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        return -1;
    }
}