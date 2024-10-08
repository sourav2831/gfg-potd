class Solution {
    public static int pairsum(int[] arr) {
        int f_largest = Integer.MIN_VALUE;
        int s_largest = Integer.MIN_VALUE;
        for(int i:arr){
            if(i>f_largest){
                s_largest = f_largest;
                f_largest = i;
            }
            else if(i>s_largest){
                s_largest = i;
            }
        }
        return s_largest + f_largest;
    }
}
