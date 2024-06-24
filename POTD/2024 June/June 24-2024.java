//Summed Matrix

class Solution {
    static long sumMatrix(long n, long q) {
        if(q>2*n||q<2) return 0;
        else if(n>=q) return q-1;
        else{
            long diff = q-n;
            return n-(diff-1);
        }
    }
}