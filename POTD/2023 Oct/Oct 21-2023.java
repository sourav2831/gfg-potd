//Sum of all divisors from 1 to n

class Solution{
    static long sumOfDivisors(int N){
        long result=0;
        int i=1;
        while(i<=N){
            result+=i*(N/i);
            i++;
        }
        return result;
    }
}