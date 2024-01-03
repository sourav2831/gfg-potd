//Perfect Numbers

class Solution {
    static int isPerfectNumber(long n) {
        long sum =1 ;
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(i!=n) sum = sum + i +n/i;
            }
            if(sum == n) return 1;
        }
        return 0;
    }
};