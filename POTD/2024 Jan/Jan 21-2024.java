//Vertex Cover

class Solution {
    private int ans;
    private ArrayList<int[]> edge;
    private int count(ArrayList<Integer> vertex) {
        for (int[] v : edge) {
            if (vertex.get(v[0] - 1) == 0 && vertex.get(v[1] - 1) == 0)
                return ans;
        }
        int c = 0;
        for (int v : vertex)
            c += v;
        return c;
    }
    private void subset(int i, ArrayList<Integer> vertex) {
        if (i == vertex.size()) {
            int val = count(vertex);
            ans = Math.min(val, ans);
            return;
        }
        subset(i + 1, vertex);
        vertex.set(i, 1);
        subset(i + 1, vertex);
        vertex.set(i, 0);
    }
    public int vertexCover(int n, int m, int[][] edges) {
        edge = new ArrayList<>();
        for (int[] e : edges) {
            edge.add(e);
        }
        ArrayList<Integer> vertex = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            vertex.add(0);
        }
        ans = n;
        subset(0, vertex);
        return ans;
    }
}