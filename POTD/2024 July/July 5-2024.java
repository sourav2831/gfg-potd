class Solution {
    public int verticalWidth(Node root) {
        HashSet<Integer> set = new HashSet<>();
        solve(root, 0, set);
        return set.size();
    }
    private void solve(Node root, int pos, HashSet<Integer> set){
        if(root == null) return;
        set.add(pos);
        solve(root.left, pos-1, set);
        solve(root.right, pos+1, set);
    }
}