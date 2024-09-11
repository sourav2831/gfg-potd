class Solution {
    int getMiddle(Node head) {
        if(head==null)return 0;
        Node temp1=head;
        Node temp2=head;
        while(temp2.next!=null&&temp2.next.next!=null){
            temp2=temp2.next.next; 
            temp1=temp1.next;
        }
        if(temp2.next==null)  return temp1.data;
        if(temp2.next.next==null)temp1=temp1.next;
        return temp1.data;
    }
}