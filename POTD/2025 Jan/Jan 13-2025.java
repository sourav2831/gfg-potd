
class Solution {
    public int maxWater(int arr[]) {
        int i=0;
        int j=arr.length-1;
        int ans=0;
        while(i<j)
        {
            ans=Math.max(ans,Math.min(arr[i],arr[j])*(j-i));
            if(arr[i]<arr[j])
            {
                i++;
            }else{
                j--;
            }
        }
        return(ans);
    }
}