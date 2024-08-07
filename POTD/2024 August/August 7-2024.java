class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                if(i+j==k-1){
                    return arr1[i];
                }
                i++;
            }else{
                if(i+j==k-1){
                    return arr2[j];
                }
                j++;
            }
        }
        while(i<arr1.length){
            if(i+j==k-1){
                return arr1[i];
            }
            i++;
        }
        while(j<arr2.length){
            if(i+j==k-1){
                return arr2[j];
            }
            j++;
        }
        return -1;
    }
}