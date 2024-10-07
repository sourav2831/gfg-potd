class Solution {
    static Node insert(Node head, int data) {
        // Code Here.
        Node newNode = new Node(data);
        newNode.npx = head;
        return newNode;
    }
    static ArrayList<Integer> getList(Node head) {
        // Code Here.
        Node curr = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(curr != null){
            list.add(curr.data);
            curr = curr.npx;
        }
        return list;
    }
}