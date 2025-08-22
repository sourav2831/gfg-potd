class Solution {
    public int median(int[][] mat) {
  
         List<Integer> sortedList = Arrays.stream(mat)
                .flatMapToInt(Arrays::stream)   
                .sorted()                       
                .boxed()                        
                .toList(); 
                
        int left =0;
        int right=sortedList.size()-1;
        int mid =left+(right-left)/2;
        return sortedList.get(mid);
    }
} 

