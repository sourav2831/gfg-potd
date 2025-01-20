class Solution {
    Node sortedMerge(Node h1, Node h2) {
        // code here
        if(h1!=null ||h2!=null){
            if(h1==null && h2 != null){
                return h2;
            }
            else if(h1!=null && h2 == null){
                return h1;
            }
            else{
                if(h1.data>=h2.data){
                    h2.next = sortedMerge(h1, h2.next);
                    return h2;
                }else{
                    h1.next = sortedMerge(h1.next, h2);
                    return h1;
                }
            }
        }
        return h1;
    }
}