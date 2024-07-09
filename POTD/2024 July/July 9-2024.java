class Solution {
    static int threeSumClosest(int[] array, int target) {
       int n=array.length-1;
       Arrays.sort(array);
       int sum=array[0]+array[1]+array[n];
       for(int i=0;i<n;i++){
           int left=i+1;
           int right=n;
           while(left<right){
               int curr=array[i]+array[left]+array[right];
               if(Math.abs(curr-target)<Math.abs(sum-target)){
                   sum=curr;
               }
               else if(Math.abs(curr-target)==Math.abs(sum-target)&& curr>sum)
               sum=curr;
               
               if(curr==target)
               return curr;
               
               else if(curr<target)
               left++;
               else
               right--;
           }
       }
       return sum;
    }
}