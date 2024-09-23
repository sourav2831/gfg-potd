class Solve {
    int[] findTwoElement(int arr[]) {
        int n = arr.length;
        int result[]=new int[2];
        int orignalSum=0;
        int currSum=0;
        for(int i=0;i<n;i++){
            int orignalElement=Math.abs(arr[i]);
            int index=orignalElement-1;
            if(arr[index]<0)result[0]=orignalElement;
            arr[index]=-arr[index];
            orignalSum+=(i+1);
            currSum+=orignalElement;
        }
        result[1]=orignalSum-(currSum-result[0]);
        return result;
    }
}