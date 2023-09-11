//Kth largest element in BST

class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    int ans;
    int k;
    public int kthLargest(Node root,int K)
    {
        ans=-1;
        k=0;
        kthLargestUtil(root,K);
        return ans;
    }
    public void kthLargestUtil(Node root, int K){
        if(root==null || k>=K)return;
        kthLargestUtil(root.right,K);
        k++;
        if(k==K){
            ans=root.data;
            return;
        }
        kthLargestUtil(root.left,K);
    }
}