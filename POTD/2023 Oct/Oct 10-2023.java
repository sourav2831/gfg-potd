//Nodes at given distance in binary tree

class Solution
{
    static ArrayList<Integer> ans;
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
    {
        ans=new ArrayList<>();
        KDistanceNodesUtil(root,target,k);
        Collections.sort(ans);
        return ans;
    }
    public static int KDistanceNodesUtil(Node root, int target, int k){
        if(root==null)return -1;
        if(root.data==target){
            kDistanceDown(root,k);
            return 0;
        }
        int left=KDistanceNodesUtil(root.left,target,k);
        if(left!=-1){
            if(left+1==k){
                ans.add(root.data);
            }else{
                kDistanceDown(root.right,k-left-2);
            }
            return 1+left;
        }
        int right=KDistanceNodesUtil(root.right,target,k);
        if(right!=-1){
            if(right+1==k){
                ans.add(root.data);
            }else{
                kDistanceDown(root.left,k-right-2);
            }
            return 1+right;
        }
        return -1;
    }
    public static void kDistanceDown(Node root, int k){
        if(root==null)return;
        if(k==0){
            ans.add(root.data);
            return;
        }
        kDistanceDown(root.left,k-1);
        kDistanceDown(root.right,k-1);
    }
};