class Solution{
    static String smallestNumber(int S, int D){
        if(9*D<S)return "-1";
        StringBuffer ans=new StringBuffer("");
        int i=1;
        while(i<D){
            if(S>9){
                S-=9;
                ans.append("9");
            }else{
                ans.append(S-1);
                S=1;
            }
            i++;
        }
        ans.append(S);
        return ans.reverse().toString();
    }
}