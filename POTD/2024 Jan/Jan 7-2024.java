//Split Array Largest Sum

class Solution {
    static int splitArray(int[] arr , int N, int K) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            sum+=num;
            max=Math.max(num,max);
        }
        int ans=Integer.MAX_VALUE;
        int l=max;
        int h=sum;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(isValid(arr,mid,K)){
                ans=Math.min(ans,mid);
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static boolean isValid(int[] arr,int requiredSum,int k) {
        int sum=0,count=1;
        for(int a : arr) {
            if(sum+a<=requiredSum) {
                sum+=a;
            } else {
                sum=a;
                count++;
            }
        }
        return count<=k;
    }
};