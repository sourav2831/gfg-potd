class Solution {
    Map<Integer, Node> map = new HashMap<>();
    Node copyList(Node head) {
        Node newHead = null, newTemp = null;
        Node temp = head;
        while(temp != null){
            if(newHead == null){
                newHead = getNode(temp);
                newTemp = newHead;
            }else{
                newTemp.next = getNode(temp);
                newTemp = newTemp.next;
            }
            temp = temp.next;
        }
        temp = head;
        newTemp = newHead;
        while(temp != null){
            if(temp.random != null) newTemp.random = map.get(temp.random.data);
            temp = temp.next;
            newTemp = newTemp.next;
        }
        return newHead;
    }
    Node getNode(Node node){
        Node newNode = new Node(node.data);
        map.put(node.data, newNode);
        return newNode;
    }
}