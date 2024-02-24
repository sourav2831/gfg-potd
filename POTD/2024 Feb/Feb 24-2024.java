//Maximum Sum Problem

class Solution
{
    public int maxSum(int n) 
    { 
        //code here.
        int n1 = n/2;
        int n2 = n/3;
        int n3 = n/4;
        int currsum = n1 + n2 + n3;
        
        if(currsum <= n) 
            return n;
        return maxSum(n1) + maxSum(n2) + maxSum(n3);
    }
}