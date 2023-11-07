//Sum of upper and lower triangles

class Solution {
    static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
        int sum1 = 0, sum2 = 0;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i <= j) sum1 += matrix[i][j];
                if(i >= j) sum2 += matrix[i][j];
            }
        }
        a.add(sum1);
        a.add(sum2);
        return a;
    }
}