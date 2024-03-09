//Find the N-th character

class Solution {
    public char nthCharacter(String s, int r, int n) {
        char c[]=s.toCharArray();
        int k=0;
        char b[]=new char[c.length];
        for( int j=1;j<=r;j++){
           for(int i=0;i<=n;i++){
                if(c[i]=='0'){
                    if(k>n)break;
                    b[k]=c[i];
                    k++;
                    if(k>n)break;
                    b[k]='1';
                    k++;
                }else{
                    if(k>n)break;
                   b[k]=c[i];
                   k++;
                   if(k>n)break;
                   b[k]='0';
                   k++;
                }
            }
            k=0;
           for(int i=0;i<=n;i++){
               c[i]=b[i];
           }
        }
        return c[n];
    }
}