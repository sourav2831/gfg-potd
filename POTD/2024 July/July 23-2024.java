class Solution {
    public List<Integer> merge(Node root1, Node root2) {
        List<Integer> al1=new ArrayList<>(),al2=new ArrayList<>();
        inorder(root1,al1); inorder(root2,al2);
        List<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        while(i<al1.size() && j<al2.size()){
            if(al1.get(i)<al2.get(j)){
                ans.add(al1.get(i));
                i++;
            }else{
                ans.add(al2.get(j));
                j++;
            }
        }
        while(i<al1.size()) ans.add(al1.get(i++));
        while(j<al2.size()) ans.add(al2.get(j++));
        return ans;
    }
    public void inorder(Node root,List<Integer> al){
        if(root==null) return;
        inorder(root.left,al);
        al.add(root.data);
        inorder(root.right,al);
    }
}