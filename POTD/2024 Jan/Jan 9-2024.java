//Search Pattern (KMP-Algorithm)

class Solution{
    ArrayList<Integer> search(String pat, String txt){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= txt.length() - pat.length(); i++) {
            int k = 0;
            while (k < pat.length() && pat.charAt(k) == txt.charAt(i + k)) {
                k++;  
            }
            if (k == pat.length()) {
                list.add(i+1);
            }
        }
        return list;
    }
}