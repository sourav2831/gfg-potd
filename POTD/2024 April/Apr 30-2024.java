//Add two numbers represented by linked lists

class Solution{
    static Node addTwoLists(Node first, Node second) {
        Node currentFirst = first, currentSecond = second;
        String n1 = "", n2 = "";

        while (currentFirst != null || currentSecond != null) {
            if (currentFirst != null) {
                n1 += currentFirst.data;
                currentFirst = currentFirst.next;
            }
            if (currentSecond != null) {
                n2 += currentSecond.data;
                currentSecond = currentSecond.next;
            }
        }
        String sumStr = sum(n1, n2);

        Node result = new Node(0);
        Node current = result;

        for (int i = 0; i < sumStr.length(); i++) {
            char c = sumStr.charAt(i);
            current.data = c - '0';
            if (i != sumStr.length() - 1) {
                current.next = new Node(0);
                current = current.next;
            }
        }
        while(result.data==0&&result.next!=null){
            result = result.next;
        }

        return result;
    }

    private static String sum(String a, String b) {
        String result = "";
        int carry = 0;
        int aLen = a.length() - 1, bLen = b.length() - 1;

        while (aLen >= 0 || bLen >= 0) {
            int ca, cb;
            try {
                ca = a.charAt(aLen) - '0';
                aLen--;
            } catch (IndexOutOfBoundsException e) {
                ca = 0;
            }
            try {
                cb = b.charAt(bLen) - '0';
                bLen--;
            } catch (IndexOutOfBoundsException e) {
                cb = 0;
            }

            int sum = ca + cb + carry;
            carry = sum / 10;
            result = (sum % 10) + result;
        }

        if (carry != 0)
            result = carry + result;
    
        return result;
    }
}