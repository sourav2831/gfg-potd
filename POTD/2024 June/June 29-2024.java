class Solution {
    public boolean areIdentical(Node head1, Node head2) {
        while(head1 != null && head2 != null){
            if(head1.data != head2.data) return false;
            head1 = head1.next;
            head2 = head2.next;
            if((head1 == null && head2 != null) || (head2 == null && head1 != null)) return false;
        }
        return true;
    }
}