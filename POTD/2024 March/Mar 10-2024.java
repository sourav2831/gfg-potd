//Remove all duplicates from a given string

class Solution {
    String removeDuplicates(String str) {
        String ans="";
        int alpha[]=new int[256];
        int i=0;
        while(i<str.length()){
            char ch=str.charAt(i);
            if(alpha[ch]==0){
                ans+=ch;
                alpha[ch]++;
            }
            i++;
        }
        return ans;
    }
}