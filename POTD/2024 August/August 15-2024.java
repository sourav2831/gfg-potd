class Solution{
    public static Node addOne(Node head) { 
        int carry=func(head);
            if(carry==1){
            Node newnode=new Node(1);
            newnode.next=head;
            return newnode;
        }
        return head;
    }
    static int func(Node head){
        if(head==null) return 1;
        int carry=func(head.next);
        if(carry==1){
            int sum=head.data+1;
            head.data=sum%10;
            return sum/10;
        }
        else return 0;
    }
}