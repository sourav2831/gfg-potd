//Merge 2 sorted linked list in reverse order

class GfG {
    Node mergeResult(Node node1, Node node2){
        Node temp = null;
        Node t1 = node1, t2 = node2;
        while(t1 != null && t2 != null){
            if(t1.data <= t2.data){
                Node nxt = t1.next;
                t1.next = temp;
                temp = t1;
                t1 = nxt;
            }else{
                Node nxt = t2.next;
                t2.next = temp;
                temp = t2;
                t2 = nxt;;
            }
        }  
        while(t1 != null){
            Node nxt = t1.next;
            t1.next = temp;
            temp = t1;
            t1 = nxt;
        }
        while(t2 != null){
            Node nxt = t2.next;
            t2.next = temp;
            temp = t2;
            t2 = nxt;;
        }
        return temp;
    }
}