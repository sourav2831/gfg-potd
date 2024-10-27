class Solution {
    public boolean findTriplet(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int sum=arr[i]+arr[j];
                if(set.contains(sum)){
                    return true;
                }
            }
        }
        return false;
    }
}