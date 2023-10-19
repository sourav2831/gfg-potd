//Form a number divisible by 3 using array digits

class Solution {
    static int isPossible(int N, int arr[]) {
        long sum = 0;
        for(int i=0; i<N; i++)sum += arr[i];
        return ((sum%3)==0)?1:0;
    }
}