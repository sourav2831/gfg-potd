class Solution {
    public static int countNumberswith4(int n) {
        // code here
        int ans=0;
        for(int i=1;i<=n;i++)
        {
        String s= String.valueOf(i);
        for(int j=0;j<s.length();j++)
        {
            if(s.charAt(j)=='4') { ans++; break;}
        }   
        }
        return ans;
    }
    
}