class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> posArr=new ArrayList<>();
        ArrayList<Integer> negArr=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<0) negArr.add(arr.get(i));
            else posArr.add(arr.get(i));
        }
        arr.clear();
        int m=Math.min(posArr.size(),negArr.size());
        int n=Math.max(posArr.size(),negArr.size());
        for(int i=0;i<m;i++){
            arr.add(posArr.get(i));
            arr.add(negArr.get(i));
        }
        if(n==posArr.size()){
            for(int i=m;i<n;i++){
                arr.add(posArr.get(i));
            }
        }
        else{
            for(int i=m;i<n;i++){
                arr.add(negArr.get(i));
            }
        }
    }
}