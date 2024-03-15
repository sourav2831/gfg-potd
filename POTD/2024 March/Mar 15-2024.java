//Linked List that is Sorted Alternatingly

class Solution {
    public Node sort(Node head){
        //your code here, return the head of the sorted list
        ArrayList<Integer> list = new ArrayList<>();
        for(Node temp = head; temp != null; temp = temp.next){
            list.add(temp.data);
        }
        Collections.sort(list);
        Node temp = head;
        for(int n : list){
            temp.data = n;
            temp = temp.next;
        }
        return head;
   }
}