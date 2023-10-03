//Roman Number to Integer

class Solution {
    static int valueOf(char c){
        switch(c){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
        }
        return 0;
    }
    public int romanToDecimal(String str) {
        int ans=0,t=0;
        for(int i=str.length()-1;i>=0;i--){
            if(valueOf(str.charAt(i))>=t){
                ans +=valueOf(str.charAt(i));
            }
            else{
                ans -= valueOf(str.charAt(i));
            }
            t=valueOf(str.charAt(i));
        }
        return ans;
    }
}