//Reverse alternate nodes in Link List

class Solution {
    public static void rearrange(Node odd) {
        Node linkedList1=odd;
        Node linkedList2=odd.next;
        Node linkedList2Head=odd.next;
        while(linkedList1.next!=null && linkedList2.next!=null){
            linkedList1.next=linkedList1.next.next;
            linkedList1=linkedList1.next;
            linkedList2.next=linkedList2.next.next;
            linkedList2=linkedList2.next;
        }
        Node reverseLinkedList2=reverse(linkedList2Head);
        linkedList1.next=reverseLinkedList2;
    }
    public static Node reverse(Node head){
        if(head==null)return head;
        if(head.next==null)return head;
        Node reverseList = reverse(head.next);
        head.next.next=head;
        head.next=null;
        return reverseList;
    }
}