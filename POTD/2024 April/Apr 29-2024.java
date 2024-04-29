//Remove every kth node

class Solution
{
    Node delete(Node head, int k)
    {
        if(head==null || k==1){
            return null;
        }
        
        int count=0;
        Node prev=null,temp=head;
        while(temp!=null){
            count++;
            if(count==k){
                prev.next=temp.next;
                count=0;
            }
            else{
                prev=temp;
            }
            temp = temp.next;
       }
       return head;
    }
}