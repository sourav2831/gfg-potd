//Count number of hops

class Solution {
    static long countWays(int n) {
        long MOD=(long)(1e9+7);
        long a=1;
        long b=2;
        long c=4;
        if(n==1)return a;
        if(n==2)return b;
        if(n==3)return c;
        int i=4;
        while(i<=n){
            long ans=(a%MOD+b%MOD+c%MOD)%MOD;
            a=b;
            b=c;
            c=ans;
            i++;
        }
        return c;
    }
}
