//Find Common Nodes in two BSTs

class Solution {
    public static ArrayList<Integer> findCommon(Node root1,Node root2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        inorder(root1,map);
        ArrayList<Integer> list = new ArrayList<>();
        res(root2,map,list);
        return list;
    }
    public static void inorder(Node root1,HashMap<Integer, Integer> map) {
        if(root1 == null) return;
        inorder(root1.left,map);
        map.put(root1.data,1);
        inorder(root1.right,map);
    } 
    public static void res(Node root2, HashMap<Integer, Integer> map, ArrayList<Integer> list){
        if(root2 == null) return;
        res(root2.left,map,list);
        if(map.containsKey(root2.data)) list.add(root2.data);
        res(root2.right,map,list); 
    }
}