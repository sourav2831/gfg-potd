class Solution {

    public int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        int temp = 1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+1==arr[i+1]){
                temp++;
            }else if(arr[i]==arr[i+1]){
                continue;
            }else{
                count=Math.max(count,temp);
                 temp=1;
            }
           count = Math.max(count,temp);
        }
        return count;
    }
}