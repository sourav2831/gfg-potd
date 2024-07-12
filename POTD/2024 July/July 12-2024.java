class Solution {
    public boolean hasPathSum(Node root, int target) {
        int[] sum = new int[1];
        boolean[] ans = new boolean[1];
        dfs(root,sum,ans,target);
        return ans[0];
    }
    public void dfs(Node root, int[] sum, boolean[] ans, int target){
        if (root == null) return;
        if (root.left == null && root.right == null){
            if (sum[0] + root.data == target) ans[0] = true;
        }
        else{
            sum[0] += root.data;
            dfs(root.left,sum,ans,target);
            dfs(root.right,sum,ans,target);
            sum[0] -= root.data;
        }
    }
}