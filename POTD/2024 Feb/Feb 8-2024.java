//Check if all leaves are at same level

class Solution
{
    int maxLevel=-1;
    boolean check(Node root){
        return checkUtil(root,0);
    }
    boolean checkUtil(Node root, int level){
        if(root==null) return true;
        if(root.left==null && root.right==null){
            if(maxLevel==-1)maxLevel=level;
            else return maxLevel==level;
        }
        return checkUtil(root.left,level+1)&&checkUtil(root.right,level+1);
    }
}
