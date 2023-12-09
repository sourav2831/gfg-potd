//Smith Number

class Solution {
    static int smithNum(int n) {
        if(isPrime(n)) return 0;
        int r1 = sumOfDigits(n);
        int r2 = 0;
        for(int i=2; i<n; i++){
            while(n%i==0){
                r2 += sumOfDigits(i);
                n /= i;
            }
        }
        if(n!=1) r2 += sumOfDigits(n);
        return r1 == r2 ? 1 : 0;
    }
    
    static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
    static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
};