//Insertion Sort for Singly Linked List

class Solution{
    public static Node insertionSort(Node head){
        if (head == null || head.next == null)return head;
        Node sorted = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            sorted = insertIntoSorted(sorted, current);
            current = next;
        }
        return sorted;
    }
    private static Node insertIntoSorted(Node sorted, Node newNode) {
        if (sorted == null || sorted.data >= newNode.data) {
            newNode.next = sorted;
            return newNode;
        }
        Node current = sorted;
        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        return sorted;
    }
}