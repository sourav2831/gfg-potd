class Solution {
    long findNth(long n) {
        long ans = 0;
        int p = 1;
    while(n != 0){
       long rem = n%9;
       ans += rem*p;
       p = p*10;
       n = n/9;
   }
   return ans;
    }
}