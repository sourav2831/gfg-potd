class Solution {
    public List<Node> printAllDups(Node root) {
        // code here
        String result = "";
        List<Node> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        pre_order(root,map,list);
        return list;
    }
    
    String pre_order(Node root,HashMap<String,Integer> map,List<Node> list){
        String result = "";
        if(root == null)
            result = "#";
        else if(root != null){
            result = pre_order(root.left,map,list)+","+root.data+","+pre_order(root.right,map,list);
            map.put(result,map.getOrDefault(result,0)+1);
            if(map.get(result) == 2)
                   list.add(root);
        }
      return result;    
    }
}