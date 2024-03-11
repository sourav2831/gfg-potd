//Count pairs Sum in matrices

class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        int i=0;
        int j=0;
        int k = n-1;
        int l = n-1;
        int count=0;
        while(i<mat1.length && k>=0){
            j=0;
            while(j<mat1.length){
                if(mat1[i][j]+mat2[k][l]==x){
                    count++;
                    j++;
                    if(l==0){
                        k--;
                        l=n;
                    }
                    if(k<0)
                        break;
                    l--;
                
                }  
                else if(mat1[i][j]+mat2[k][l]>x){
                    if(l==0){
                        k--;
                        l=n;
                    }
                    if(k<0)
                        break;
                    l--;
                }
                else
                    j++;
                }
            i++;
        }
        return count;
    }
}