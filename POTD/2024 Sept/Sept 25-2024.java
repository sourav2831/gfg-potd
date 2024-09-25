class Solution {
    boolean isPalindrome(Node head) {
        Node temp=head;
        String s="";
        ArrayList<Integer> al=new ArrayList<>();
         ArrayList<Integer> al1=new ArrayList<>();
        while(temp!=null) {
            al.add(temp.data);
            al1.add(temp.data);
            temp=temp.next;
        }
        Collections.reverse(al);
        if(al.equals(al1)) return true;
        return false;
    }
}