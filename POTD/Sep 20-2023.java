//Rotate Bits

class Solution {
    ArrayList<Integer> rotate(int N, int D){
        D = D%16 ; 
        ArrayList<Integer> list = new ArrayList<>() ; 
        int leftRotation = ( N<<D | N>>(16-D) )&65535 ;  //to convert into 16 bit;
        int rightRotation = ( N>>D | N<<(16-D) ) &65535 ;
        list.add(leftRotation) ; 
        list.add(rightRotation) ; 
        return list;
    }
}