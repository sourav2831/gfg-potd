//Frequencies of Limited Range Array Elements

class Solution{
    public static void frequencyCount(int arr[], int N, int P) {
        for(int i:arr)if(i%(N+P)<=N) arr[i%(N+P)-1]+=(N+P);
        for(int i=0;i<N;i++)arr[i]=arr[i]/(N+P);
    }
}