class Solution {
    public List<Integer> shortestPath(int n, int m, int edges[][]) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            graph.get(u).add(new int[] { v, w });
            graph.get(v).add(new int[] { u, w });
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(new int[] { 1, 0 });
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;
        int[] prev = new int[n + 1];
        Arrays.fill(prev, -1);
        boolean[] visited = new boolean[n + 1];
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int u = current[0];
            int d = current[1];
            if (visited[u]) continue;
            visited[u] = true;
            for (int[] neighbor : graph.get(u)) {
                int v = neighbor[0];
                int weight = neighbor[1];
                if (d + weight < dist[v]) {
                    dist[v] = d + weight;
                    prev[v] = u;
                    pq.offer(new int[] { v, dist[v] });
                }
            }
        }
        if (dist[n] == Integer.MAX_VALUE) {
            return Collections.singletonList(-1);
        }
        List<Integer> path = new ArrayList<>();
        for (int at = n; at != -1; at = prev[at]) {
            path.add(at);
        }
        Collections.reverse(path);
        path.add(0, dist[n]);
        return path;
    }
}