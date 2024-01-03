//Transform to prime

class Solution{
    public boolean isPrime(int n){
        if (n<=1)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
    public int minNumber(int arr[], int N)
    {
        int s=Arrays.stream(arr).sum();
        int c=s;
        while(!isPrime(s))
            s+=1;
        return s-c;
    }
}