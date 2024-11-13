class Intersect {
    int intersectPoint(Node head1, Node head2) {
        Set<Node> set = new HashSet<>();
        while(head1 != null){
            set.add(head1);
            head1 = head1.next;
        }
        while(head2 != null){
            if(set.contains(head2)){
                return head2.data;
            }else{
                set.add(head2);
            }
            head2 = head2.next;
        }
        return 0;
    }
}
