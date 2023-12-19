//Rightmost different bit

class Solution{
    public static int posOfRightMostDiffBit(int m, int n){
        return m == n ? -1 : Integer.numberOfTrailingZeros(m ^ n) +  1; 
    }
}
