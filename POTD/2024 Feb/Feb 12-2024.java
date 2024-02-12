//Recursive sequence

class Solution{
    static long sequence(int n){
        long ans = 0;
        long MOD = 1000000007;
        int num = 1;
        for(int i=0; i<n; i++){
            long mul = 1;
            for(int j=0; j<=i; j++, num++){
                mul *= num;
                mul %= MOD;
            }
            ans += mul;
            ans %= MOD;
        }
        return ans;
    }
}