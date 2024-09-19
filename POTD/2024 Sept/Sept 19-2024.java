class Solution {
    String reverseWords(String s) {
        String reverseAns[]=s.split("\\.");
        String ans="";
        for(int i=reverseAns.length-1;i>=0;i--){
            ans+=reverseAns[i];
            if(i!=0)
            ans+=".";
        }
        return ans;
    }
}