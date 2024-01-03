//Smallest window containing 0, 1 and 2

class Solution {
    public int smallestSubstring(String S) {
        int k = 2;
        while(k++ < S.length()) {
            for(int i=0; i<=S.length() - k; i++) {
                if((S.substring(i,i+k).contains("0")) && (S.substring(i,i+k).contains("1")) 
                    && (S.substring(i,i+k).contains("2")))
                    return k;
            }
        }
        return -1;
    }
};