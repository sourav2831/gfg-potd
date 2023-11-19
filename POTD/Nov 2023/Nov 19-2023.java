//Intersection of two sorted Linked lists

class Solution
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        if(head1==null || head2==null){
            return null;
        }
        else if(head1.data==head2.data){
            Node temp = new Node(head1.data);
            temp.next=findIntersection(head1.next, head2.next);
            return temp;
        }
        else if(head1.data>head2.data){
            return findIntersection(head1, head2.next);
        }
        else{
            
            return findIntersection(head1.next, head2);
        }
    }
}