//Juggler Sequence

class Solution{
    static List<Long> jugglerSequence(long n) {
        List<Long> al = new ArrayList<Long>();
        al.add(n);
        helper(al);
        return al;
    }
    static void helper( List<Long> al){
        long lastElement=(al.get(al.size()-1));
        if(lastElement==1)
            return;
        if(lastElement%2==0){
            al.add((long) Math.floor(Math.sqrt(lastElement)));
            helper(al);
        }
        else{
            al.add((long) Math.floor(Math.pow(lastElement, 1.5)));
            helper(al);
        }
        return;       
    }
}