//Mother Vertex
class Solution {
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        int lastVisited = 0;
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(adj, i, visited);
                lastVisited = i;
            }
        }
        Arrays.fill(visited, false);
        dfs(adj, lastVisited, visited);
        for (boolean v : visited) {
            if (!v) {
                return -1;
            }
        }

        return lastVisited;
    }

    private void dfs(ArrayList<ArrayList<Integer>> adj, int v, boolean[] visited) {
        visited[v] = true;
        for (int u : adj.get(v)) {
            if (!visited[u]) {
                dfs(adj, u, visited);
            }
        }
    }
}