//Print Matrix in snake Pattern

class Solution {
    static ArrayList<Integer> snakePattern(int a[][]){
        int n = a.length;
        int val = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%2==0)val=0;
            else val=n-1;
            for(int j=0;j<n;j++){
                list.add(a[i][Math.abs(val-j)]);    
            }
        }
        return list;
    }
}