class GfG {
    public static Tree convert(Node head, Tree node) {
        if(head==null)return null;
        Queue<Tree> q = new LinkedList<>();
        Tree ans = new Tree(head.data);
        q.add(ans);
        while(head!=null){
            Tree tem = q.remove();
            head = head.next;
            if(head!=null){
                 tem.left= new Tree(head.data);
                 q.add(tem.left);
                 head=head.next;
            }
            if(head!=null){
                tem.right=new Tree (head.data);
                q.add(tem.right);
            }
        }
        return ans;
    }
} 