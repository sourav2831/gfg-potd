//Level of Nodes

class Solution {
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X) {
        int level = 0;
        boolean[] visited=new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                int currNode = q.remove();
                if(currNode==X)return level;
                for(int nbr : adj.get(currNode)){
                     if(!visited[nbr]){
                         visited[nbr]=true;
                         q.add(nbr);
                     }
                }
            }
            level++;
        }
        return -1;
    }
}