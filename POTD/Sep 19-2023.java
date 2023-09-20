//Find first set bit

class Solution {
    public static int getFirstSetBit(int n){
        for(int i=0;i<31;i++){
            if((n&(1<<i))!=0)return i+1;
        }
        return 0;
    }
}