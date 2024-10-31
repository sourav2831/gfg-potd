class Solution {
    public Node sortedInsert(Node head, int x) {
        Node newNode = new Node(x);
        if(head == null || head.data > x){
            newNode.next = head;
            if(head != null) head.prev = newNode;
            return newNode;
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data > x) break;
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
        if(newNode.next != null) newNode.next.prev = newNode;
        return head;
    }
}