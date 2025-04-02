class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int numVertex = adj.size();
        boolean visited [] = new boolean[numVertex];
        ArrayList<Integer> res = new ArrayList<>();
        int startVertex = 0;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(startVertex);
        visited[startVertex] = true;
        while(q.size()>0){
            int currNode = q.remove();
            res.add(currNode);
            for(int neighbour : adj.get(currNode)){
                if(!visited[neighbour]){
                    q.add(neighbour);
                    visited[neighbour]=true;
                }
            }
        }
        return res;
    }
}