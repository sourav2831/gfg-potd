class Solution {
    public Node cloneLinkedList(Node head) {
        HashMap<Node,Integer> oldListMap = new HashMap<Node,Integer>();
        HashMap<Integer,Node> newListMap = new HashMap<Integer,Node>();
        Node newNodeHead = new Node(head.data);
        Node travOld = head.next;
        Node travNew=newNodeHead;
        oldListMap.put(head,1);
        newListMap.put(1,newNodeHead);
        int i= 2;
        while(travOld!=null){
            Node n = new Node(travOld.data);
            travNew.next= n;
            travNew=n;
            oldListMap.put(travOld,i);
            newListMap.put(i,n);
            i++;
            travOld=travOld.next;
        }
        travOld=head;
        travNew=newNodeHead;
        while(travOld!=null){
            if(travOld.random == null){
                travNew.random = null;
            }
            else{
                int index = oldListMap.get(travOld.random);
                Node n = newListMap.get(index);
                travNew.random=n;
            }
            travOld =travOld.next;
            travNew=travNew.next;
        }
        return newNodeHead;
    }
}