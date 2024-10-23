class Solution {
    public int sumOfLastN_Nodes(Node head, int n) {
        int totalNodes = 0;
        Node current = head;
        while(current != null){
            current = current.next;
            totalNodes++;
        }
        int target = totalNodes - n;
        current = head;
        while(target > 0){
            current = current.next;
            target--;
        }
        int sum = 0;
        while(current != null){
            sum += current.data;
            current = current.next;
        }
        return sum;
    }
}