//Subarray with 0 sum

class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        int prefixSum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int iterator=0;
        while(iterator<n){
            prefixSum+=arr[iterator];
            if(prefixSum==0||map.containsKey(prefixSum)){
                return true;
            }
            map.put(prefixSum,1);
            iterator++;
        }
        return false;
    }
}