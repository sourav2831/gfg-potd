//Bleak Numbers

class Solution {
    public int is_bleak(int n) {
        if(n==0) return 0;
        int size = (int)Math.ceil(Math.log(n) / Math.log(2));
        for(int i=n-size; i<=n; i++){
            if( i + countSetBits(i) == n ) return 0;
        }
        return 1;
    }
    public int countSetBits(int n){
        int ct = 0;
        while(n > 0){
            n &= (n-1);
            ct++;
        }
        return ct;
    }
}