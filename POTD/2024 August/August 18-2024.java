class Solution {
    public boolean canSplit(int arr[]) {
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        int subtotal=0;
        for(int i=0;i<arr.length;i++){
           total=total-arr[i];
           subtotal+=arr[i];
           if(subtotal==total)return true;
        }
        return false;
    }
}