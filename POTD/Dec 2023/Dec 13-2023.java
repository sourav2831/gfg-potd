//Consecutive 1's not allowed

class Solution {
    long countStrings(int n) {
        long a=0,b=1;
        long s=0;
        for(int i=0;i<=n;i++){
            s=(a+b)%1000000007;
            a=b;
            b=s;
        }
        return s;
    }
}