//Insert in a Sorted List

class Solution {
    Node sortedInsert(Node head1, int key) {
        if(head1==null){
            Node curr=new Node(key);
            return curr;
        }
        if(key<=head1.data){
            Node curr=new Node(key);
            curr.next=head1;
            return curr;
        }
        head1.next=sortedInsert(head1.next,key);
        return head1;
    }
}