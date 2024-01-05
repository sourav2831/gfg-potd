//Count possible ways to construct buildings

class Solution{
    public int TotalWays(int N){
        long space=1;
        long plot=1;
        for(int i=1; i<N; i++){
            long temp=space;
            space=(space+plot)%1000000007;
            plot=temp%1000000007;
        }
        long ans=(space+plot)%1000000007;
        long anss=(ans*ans)%1000000007;
        return (int)anss;
    }
}