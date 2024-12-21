class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int arr[][]) {
        int len=arr.length;
        // reverese the array
        for(int i=0;i<len;i++){
           int st=0,lst=len-1;
           while(lst>st){
               int temp=arr[i][st];
               arr[i][st]=arr[i][lst];
               arr[i][lst]=temp;
               st++;
               lst--;
           }
        }
        // take transpose
        for(int i=0;i<len;i++){
            for(int j=0;j<=i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
}

