//Party of Couples

class Solution{
    static int findSingle(int n, int arr[]){
        int single = 0;
        for (int a : arr) {
            single ^= a;
        }
        return single;
    }
}