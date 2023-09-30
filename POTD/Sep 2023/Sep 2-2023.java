//Leaf under budget

class Pair{
    Node node;
    int level;
    Pair(Node _node, int _level){
        node=_node;
        level=_level;
    }
}
class Solution{
    public int getCount(Node node, int bud){
         Queue<Pair> q=new LinkedList<>();
         int ans=0;
         q.add(new Pair(node,1));
         while(!q.isEmpty()){
             int size=q.size();
             while(size-->0){
                Pair temp=q.remove();
                if(temp.node.left==null && temp.node.right==null){
                    if(temp.level<=bud)bud-=temp.level;
                    else return ans;
                    ans++;
                }else{
                    if(temp.node.left!=null)q.add(new Pair(temp.node.left,temp.level+1));
                    if(temp.node.right!=null)q.add(new Pair(temp.node.right,temp.level+1));
                }
             }
         }
         return ans;
    }
}