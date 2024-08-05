class Pair{
    int axis;
    Node node;
    Pair(int _axis,Node _node){
        axis=_axis;
        node=_node;
    }
}

class Solution{
    static ArrayList<Integer> bottomView(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair curr=q.remove();
            map.put(curr.axis,curr.node.data);
            if(curr.node.left!=null)q.add(new Pair(curr.axis-1,curr.node.left));
            if(curr.node.right!=null)q.add(new Pair(curr.axis+1,curr.node.right));
        }
        for(int key:map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
}