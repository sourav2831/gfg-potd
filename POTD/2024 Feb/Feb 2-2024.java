//Implement Atoi

class Solution{
    int atoi(String str) {
        int placeValue=1;
        int sum=0;
        int i=str.length()-1;
        int end=(str.charAt(0)=='-')?1:0;
        while(i>=end){
            int ch=(str.charAt(i)<'0' || str.charAt(i)>'9')?-1:str.charAt(i)-'0';
            if(ch==-1)return ch;
            sum+=(placeValue*ch);
            placeValue*=10;
            i--;
        }
        return (end==1)?-1*sum:sum;
    }
}