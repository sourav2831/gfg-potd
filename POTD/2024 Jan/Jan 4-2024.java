//Find element occuring once when all other are present thrice

class Solution {
    static int singleElement(int[] arr , int N) {
        HashMap <Integer,Integer> hm=new HashMap <Integer,Integer>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:hm.keySet()){
            if(hm.get(i)==1){
                return i;
            }
        }
        return -1;
    }
}