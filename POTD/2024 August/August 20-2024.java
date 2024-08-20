class Solution
{
    private static Node parentMapping(Node root,int target,HashMap<Node,Node> map){
        Node targetNode = null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        map.put(root,null);
        while(!q.isEmpty()){
            Node front = q.poll();
            
            if(front.data == target)
                targetNode = front;
                
            if(front.left != null){
                map.put(front.left,front);
                q.add(front.left);
            }
            if(front.right != null){
                map.put(front.right,front);
                q.add(front.right);
            }
        }
        return targetNode;
    }
    private static int burnTree(Node root,HashMap<Node,Node> map){
        HashSet<Node> visited = new HashSet<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        visited.add(root);
        int time = 0;
        while(!q.isEmpty()){
            
            int size = q.size();
            boolean flag = false;
            
            for(int i=0;i<size;i++){
                
                Node front = q.poll();
                
                if(front.left != null && !visited.contains(front.left)){
                    visited.add(front.left);
                    q.add(front.left);
                    flag = true;
                }
                if(front.right != null && !visited.contains(front.right)){
                    visited.add(front.right);
                    q.add(front.right);
                    flag = true;
                }
                Node parentNode = map.get(front);
                if(parentNode != null && !visited.contains(parentNode)){
                    visited.add(parentNode);
                    flag = true;
                    q.add(parentNode);
                }
                
            }
            if(flag)
                time++;
        }
        return time;
    }
    public static int minTime(Node root, int target) {
        HashMap<Node,Node> map = new HashMap<>();
        Node targetNode = parentMapping(root, target,map);
        return burnTree(targetNode,map);
    }
}