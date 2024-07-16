class Solution {
    public String printString(String s, char ch, int count) {
        char a[]=s.toCharArray();
        for(int  i=0;i<a.length;i++){
            if(a[i]==ch) count--;
            if(count==0) return s.substring(i+1);
        }
        return "";
    }
}