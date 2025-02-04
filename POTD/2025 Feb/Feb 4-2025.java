class Solution {
    int dia=0;
    int diameter(Node root) {
        if(root==null){
            return 0;
        }
        diameterAns(root);
        return dia;
    }
    int diameterAns(Node root){
        if(root==null){
            return 0;
        }
        int a1=diameterAns(root.left);
        int a2=diameterAns(root.right);
        dia=Math.max(dia,a1+a2);
        return 1+Math.max(a1,a2);
    }
}
