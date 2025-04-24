class Solution {
    public static boolean checkbit(int x, int i){
         return ((x >> i) & 1) == 1;
    }
    int ans = 0;
    public int getSingle(int[] arr) {
        // code here
        for(int i = 0; i <= 31; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(checkbit(arr[j], i)){
                    count  = count +1;
                }
            }
            if(count % 3 == 1){
                ans = ans + (1 << i);
            }
        }
        return ans;
    }
}