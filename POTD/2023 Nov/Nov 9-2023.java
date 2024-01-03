//Predict the Column

class Solution {
    int columnWithMaxZeros(int arr[][], int N) {
        int maxZero = -1; 
        int index = -1;
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j][i]==0) count++;
            }
            if(maxZero<count && count != 0){
                maxZero = count;
                index = i;
            }
        }
        if(maxZero==-1) return -1;
        return index;
    }
}