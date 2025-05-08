class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        findPaths(root, path, result);
        return result;
        
    }
    
    private static void findPaths(Node node, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> result) {
        if (node == null) return;

        path.add(node.data);

        if (node.left == null && node.right == null) {
            result.add(new ArrayList<>(path));
        } else {
            findPaths(node.left, path, result);
            findPaths(node.right, path, result);
        }

        // Backtrack
        path.remove(path.size() - 1);
    }
}

