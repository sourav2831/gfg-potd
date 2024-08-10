class Solution{
    public Node rotate(Node head, int k) {
        int count = 1;
        Node temp = head;
        while(count < k) {
            temp = temp.next;
            count += 1;
        }
        Node newHead = temp.next;
        if(newHead == null) return head;
        temp.next = null;
        temp = newHead;
        while(temp.next != null)temp = temp.next;
        temp.next = head;
        return newHead;
    }
}