//Sum of nodes on the longest path from root to leaf node

class Solution{
    int ans[];
    public int sumOfLongRootToLeafPath(Node root)
    {
        ans=new int[2];
        sumOfLongRootToLeafPathUtil(root,0,0);
        return ans[1];
    }
    public void sumOfLongRootToLeafPathUtil(Node root, int level,int sum){
        if(root==null)return;
        sum+=root.data;
        if(root.left==null && root.right==null){
            if(level>ans[0]){
                ans[0]=level;
                ans[1]=sum;
            }else if(level==ans[0]){
                ans[1]=Math.max(ans[1],sum);
            }
            return;
        }
        sumOfLongRootToLeafPathUtil(root.left,level+1,sum);
        sumOfLongRootToLeafPathUtil(root.right,level+1,sum);
    }
}
