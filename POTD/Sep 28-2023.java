// Wave Array

class Solution{
    public static void convertToWave(int n, int arr[]){
        int endPoint=n;
        if(n%2!=0)endPoint--;
        for(int i=0;i<endPoint;i+=2){
            arr[i]=arr[i]^arr[i+1];
            arr[i+1]=arr[i]^arr[i+1];
            arr[i]=arr[i]^arr[i+1];
        }
    }
}