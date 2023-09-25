//Find All Four Sum Numbers

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        HashSet<ArrayList<Integer>> set=new HashSet<>();
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0;i<arr.length-3;i++){
            for(int j=i+1;j<arr.length-2;j++){
                int left=j+1;
                int right=arr.length-1;
                while(left<right){
                    if(arr[i]+arr[j]+arr[left]+arr[right]==k){
                        ArrayList<Integer> a=new ArrayList<>();
                        a.add(arr[i]);
                        a.add(arr[j]);
                        a.add(arr[left]);
                        a.add(arr[right]);
                        if(!set.contains(a)){
                            ans.add(a);
                            set.add(a);
                        }
                        left++;
                        right--;
                    }else if(arr[i]+arr[j]+arr[left]+arr[right]>k){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return ans;
    }
}