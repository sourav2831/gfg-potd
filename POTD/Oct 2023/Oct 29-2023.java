//Check whether K-th bit is set or not

class CheckBit{
    static boolean checkKthBit(int n, int k){
        if((n & (1<<k))==0)return false;
        else return true;
    }
}