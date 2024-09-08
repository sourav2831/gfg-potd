class Solution{
    static int minJumps(int[] arr){
        int arrayLength=arr.length;
        int currIndex=0;
        int lastElementIndex=arr[0];
        int minJumpCount=0;
        while(currIndex<arrayLength-1){
            if(arr[currIndex]==0){
                return -1;
            }
            if(currIndex+arr[currIndex]>=arrayLength-1){
                return minJumpCount+1;
            }
            int nextCurrIndex=getNextCurrIndex(currIndex+1,lastElementIndex,arrayLength,arr);
            currIndex=nextCurrIndex;
            lastElementIndex=arr[currIndex]+currIndex;
            minJumpCount++;
        }
        return minJumpCount;
    }
    static int getNextCurrIndex(int startIndex,int endIndex,int arrayLength, int[] arr){
                int maxInInterval=0;
                int maxIndex=startIndex;
                while(startIndex<=endIndex && startIndex<arrayLength){
                    if(maxInInterval<arr[startIndex]+startIndex){
                        maxInInterval=arr[startIndex]+startIndex;
                        maxIndex=startIndex;
                    }
                    startIndex++;
                }
                return maxIndex;
    }
}