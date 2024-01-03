//Find duplicates in an array

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        Map<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i]) && hm.get(arr[i])==1){
                al.add(arr[i]);
            }
            if(!hm.containsKey(arr[i]))
            hm.put(arr[i],1);
            else
            hm.put(arr[i],hm.get(arr[i])+1);
        }
        if(al.isEmpty()){
            al.add(-1);
            return al;
        }
        Collections.sort(al);
        return al;
    }
}