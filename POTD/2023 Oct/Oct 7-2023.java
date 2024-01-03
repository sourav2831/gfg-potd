//Pairwise swap elements of a linked list

class Solution {
    public Node pairwiseSwap(Node node) {
        if(node==null || node.next==null)return node;
        Node p = node;
        Node ans= node.next;
        Node tail=null;
        while(p!= null && p.next != null){
            Node temp = p.next;
            p.next = p.next.next;
            temp.next = p;
            if(tail!=null)tail.next=temp;
            tail=p;
            p=p.next;
        }
        return ans;
    }
}