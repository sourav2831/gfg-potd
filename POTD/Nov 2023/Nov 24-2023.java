//Pascal Triangle

class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        ArrayList <ArrayList<Long>> al=new ArrayList<ArrayList<Long>>();
        ArrayList <Long> h;
        Long p=1000000007L;
        for(int i=0;i<n;i++){
            h=new ArrayList <Long>();
            for(int j=0;j<i+1;j++){
                if(j==0 ||j==i){
                    h.add(1%p);
                }
                else{
                    h.add((al.get(i-1).get(j-1)+al.get(i-1).get(j))%p);
                }
            }
            al.add(h);
        }
        return al.get(n-1);
    }
}