//Duplicate subtree in Binary Tree

class Solution {
    HashMap<String,Integer> map=new HashMap<>();
    int dupSub(Node root) {
         dupSubAns(root);
         for(int item:map.values()){
             if(item>=2)return 1;
         }
         return 0;
    }
    String dupSubAns(Node root){
        if(root==null)return "$";
        if(root.left==null && root.right==null)return ""+root.data;
        String l=dupSubAns(root.left);
        String r=dupSubAns(root.right);
        String s=root.data+"@"+l+"@"+r;
        map.put(s,map.getOrDefault(s,0)+1);
        return s;
    }
}