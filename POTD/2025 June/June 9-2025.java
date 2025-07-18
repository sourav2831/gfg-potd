class Item{
    int data;
    boolean isLeaf;
    public Item(int data, boolean isLeaf){
        this.data = data;
        this.isLeaf = isLeaf;
    }
}
class Solution {
    public boolean isDeadEnd(Node root) {
        ArrayList<Item> itemList = new ArrayList<>();
        traverse(root, itemList);
        for(int i=0; i<itemList.size()-1; i++){
            Item item = itemList.get(i);
            if(i == 0){
                if(item.isLeaf && 
                    (item.data == 1 && (itemList.size() > 1 && item.data+1 >= itemList.get(i+1).data))){
                    return true;
                }
            }else {
               if(item.isLeaf && item.data-1 <= itemList.get(i-1).data &&
                    item.data+1 >= itemList.get(i+1).data){
                        return true;
                    } 
            }
        }
        
        return false;
    }
    
    private void traverse(Node root, ArrayList<Item> itemList){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            itemList.add(new Item(root.data, true));
            return;
        }
        
        traverse(root.left, itemList);
        itemList.add(new Item(root.data, false));
        traverse(root.right, itemList);
    }
}