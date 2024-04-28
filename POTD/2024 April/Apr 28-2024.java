//Delete Middle of Linked List

class Solution{
    Node deleteMid(Node head){
        if (head == null) return null;
        
        if (head.next == null)
            return null;
        Node prev = null;
        Node slow_ptr = head;
        Node fast_ptr = head;
        while (fast_ptr != null && fast_ptr.next != null){
            fast_ptr = fast_ptr.next.next;
            prev = slow_ptr;
            slow_ptr = slow_ptr.next;
        }
        prev.next = slow_ptr.next;
        return head;
    }
}