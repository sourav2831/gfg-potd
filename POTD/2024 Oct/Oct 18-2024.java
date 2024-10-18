class Solution {
    int getSingle(int arr[]) {
        int result = 0;
        for(int num: arr){
            result ^= num;
        }
        return result;
    }
}