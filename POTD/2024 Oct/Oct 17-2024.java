class Solution {
    Node[] alternatingSplitList(Node head) {
    Node[] ans = {head, head.next};
    while (head.next != null) {
        Node nxt = head.next;
        head.next = nxt.next;
        head = nxt;
    }
    return ans;
    }
}