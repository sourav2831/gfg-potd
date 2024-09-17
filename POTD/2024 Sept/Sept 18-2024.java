class Solution{
    static boolean ispar(String x) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='(' || x.charAt(i)=='{' || x.charAt(i)=='[') st.push(x.charAt(i));
            else{
                if(st.empty()) return false;
                char start=x.charAt(i);
                char stop;
                if(start==')') stop='(';
                else if(start==']') stop='[';
                else stop='{';
                while(!st.empty()){
                    if(st.peek()!=stop) return false;
                    else{
                        st.pop();
                        break;
                    }
                }
            }
        }
        if(st.empty()) return true;
        else return false;
    }
}