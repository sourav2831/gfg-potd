//Equilibrium Point

class Solution {
    public static int equilibriumPoint(long arr[], int n) {
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        long leftSum=0;
        long rightSum=sum-arr[0];
        for(int i=0;i<n;i++){
            if(leftSum==rightSum){
                return i+1;
            }
            leftSum+=arr[i];
            if(i!=n-1)
            rightSum-=arr[i+1];
        }
        return -1;
    }
}
