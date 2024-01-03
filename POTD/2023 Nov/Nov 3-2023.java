//Pythagorean Triplet

class Solution {
    boolean checkTriplet(int[] arr, int n) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : arr)hs.add(i*i);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sq = arr[i]*arr[i] + arr[j]*arr[j];
                if(hs.contains(sq)) return true;
            }
        }
        return false;
    }
}