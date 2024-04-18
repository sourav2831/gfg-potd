//Two Repeated Elements

class Solution
{
    //Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int n)
    {
        // Your code here
        int ans[]= new int[2];
        ans[0]=ans[1]=-1;
        HashMap <Integer, Integer> map= new HashMap<>();
        
        for(int i:arr)
        {
            if(map.containsKey(i))
            {
                if(ans[0]==-1)
                ans[0]=i;
                else
                {
                    ans[1]=i;
                    return ans;
                }
            }
            else
            map.put(i,1);
        }
        return ans;
    }
    
}