class Solution {
    public static Node findFirstNode(Node head) {
       Set<Node> set =new HashSet<>();
       Node current = head;
       while(current !=null ){
           if(!set.contains(current)){
               set.add(current);
           }else{
               return current;
           }
           current = current.next;
       }
       return null;
    }
}