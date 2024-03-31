//Closest Neighbour in BST

class Solution {
    public static int findMaxForN(Node root, int n) {
        int m[]=new int[1];
        m[0]=-1;
        func(root,n,m);
        return  m[0];
    }
    
    public static void func(Node root,int n,int m[]){
        if(root==null)return ;
        if((root.key<=n)){
            if(root.key>=m[0]){
            m[0]=root.key;
        }
        }
        func(root.left,n,m);
        func(root.right,n,m);
    }
}