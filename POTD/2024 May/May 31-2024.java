//Swap two nibbles in a byte

class Solution {
    int reduce(int num){
        if(num<=255){
            return num;
        }
        return reduce(num-255);
    }
    
    int swapNibbles(int n) {
        int num = n*16;
        return reduce(num);
    }
}