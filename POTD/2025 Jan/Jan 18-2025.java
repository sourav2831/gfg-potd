class Solution {
    Node reverseList(Node head) {
        Node h = head;
        Node d = head;
        ArrayList<Integer> al = new ArrayList<>();
        while(h!=null){
            al.add(h.data);
            h=h.next;
        }
        for(int i=al.size()-1;i> -1;i--){
            head.data=al.get(i);
            head = head.next;
        }
        return d;
    }
}