//Game of XOR

class Solution {
    static int gameOfXor(int N , int[] A) {
        int xor=0;
        if((N&1)==0){
            return 0;
        }
        for(int i=0;i<N;i+=2){
            xor^=A[i];
        }
        return xor;
    }
};