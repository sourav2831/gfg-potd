class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] == 0) {
                continue;
            }
            if (arr[i - 1] == arr[i]) {
                arr[i - 1] = arr[i - 1] * 2;
                arr[i] = 0;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        int zeroCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                res.add(arr[i]);
            } else {
                zeroCount++;
            }
        }
        for (int i = 0; i < zeroCount; i++) {
            res.add(0);
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 2, 0, 4, 0, 8}; 
        ArrayList<Integer> result1 = modifyAndRearrangeArr(arr1);
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}