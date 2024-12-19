class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int n = arr.length;
        int map[] = new int[1000000];
        for(int i=0;i<n;i++){
            map[arr[i]-1]++;
        }
        
        int i=0;
        while(k>0){
            if(map[i]==0){
                k--;
            }
            i++;
        }
        
        return i;
    }
}

