//Largest number possible

class Solution{
    static String findLargest(int n, int sum){
        String s="";
        if(sum>9 && n==1)return "-1";
        if(sum==0 && n!=1)return "-1";
        if(sum>9*n)return "-1";
        while(sum!=0){
            if(sum>=9){   
                String t="9";
                s+=t.repeat(sum/9);
                sum=sum%9;
            }
            else {
                s+=Integer.toString(sum);
                sum=0;
            }
        }
        if(sum==0 && s.length()!=n){  
            String t="0";
            s+=t.repeat(n-s.length());
        }
        if(sum!=0)return "-1";
        return s;
    }
}