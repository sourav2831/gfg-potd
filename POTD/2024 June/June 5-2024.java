//Swapping pairs make sum equal

class Solution {
    long findSwapValues(long A[], int n, long  B[], int m)
    {
        long diff = 0;
        for(int i = 0; i < n; i++){
            diff+=A[i];
        }
        for(int i = 0; i < m; i++){
            diff-=B[i];
        }
        if((diff&1) == 1)
            return -1;
        diff = diff/2;
        Arrays.sort(A);
        Arrays.sort(B);
        int idx = Arrays.binarySearch(A,diff + 1);
        if(idx < 0)
            idx = -idx - 1;
        for(int i = idx; i < n; i++){
            int j = Arrays.binarySearch(B, A[i] - diff);
            if(j >=0)
                return 1;
        }
        return -1;   
    }
}