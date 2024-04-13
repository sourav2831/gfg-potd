//Reverse Bits

class Solution {
    static Long reversedBits(Long x) {
        int f = 31, l = 0;
        long rev = 0;
        
        while(f > l) {
            if((x & (1L<<f)) != 0) {   
                rev = rev | (1L<<l); 
            }
            if((x & (1L<<l)) != 0) {
                rev = rev | (1L<<f);
            }
            f--; l++;
        }
        return rev;
    }
};