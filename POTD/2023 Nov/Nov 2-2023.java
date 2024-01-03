//Minimum distance between two numbers

class Solution {
    int minDist(int a[], int n, int x, int y) {
        int minDist = -1;
        int xi = -1;
        int yi = -1;
        for(int i=0; i<n; ++i) {
            if(a[i] == x) {
                xi = i;
                if(yi > -1 && (minDist == -1 || minDist > Math.abs(yi-xi))) {
                    minDist = Math.abs(yi-xi);
                }
            }
            if(a[i] == y) {
                yi = i;
                if(xi > -1 && (minDist == -1 || minDist > Math.abs(yi-xi))) {
                    minDist = Math.abs(yi-xi);
                }
            }
        }
        
        return minDist;
    }
}