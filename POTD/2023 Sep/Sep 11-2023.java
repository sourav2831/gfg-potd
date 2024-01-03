//Lucky Numbers

class Solution {
    int counter = 2;
    public  boolean isLucky(int n){
        if(n%counter==0){
            return false;
        }
        if(n/counter==0){
            return true;
        }
        return isLucky(n-(n/counter++));
    }
}