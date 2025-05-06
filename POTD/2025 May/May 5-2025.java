class Solution {
    public int findTarget(int arr[], int target) 
    {
        int found = 0;
        int num = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                found=1;
                num=i;
                break;
            }
        }
        if(found==1)
        {
            return num;
        }
        else
        {
            return -1;
        }
        
    }
}