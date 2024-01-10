//Longest subarray with sum divisible by K

class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k){
        int []sum = new int[n];
        sum[0]=a[0];
        for(int i=1;i<n;i++)
            sum[i]=sum[i-1]+a[i];
        int longest=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int remainder = sum[i]%k;
            if(remainder==0){
                if(i+1 > longest)
                    longest = i+1;
                continue;
            }
            if(remainder < 0)remainder+=k;
            if(map.containsKey(remainder)){
                if(longest < i-map.get(remainder))longest=i-map.get(remainder);
            }else
                map.put(remainder,i);
        }
        return longest;
    }
}