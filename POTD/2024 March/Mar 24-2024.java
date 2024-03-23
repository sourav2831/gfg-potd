class Solution {
    public Stack<Integer> push1(Stack<Integer> st, Stack<Integer> st1){
        if (st.isEmpty()) 
        return st1; 
    
        int x = st.peek(); 
        st.pop(); 
        Stack<Integer> st3 = push1(st,st1); 
        st1.push(x);
        return st3;
    }
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> st1 = new Stack<Integer>();
        st1.add(x);
        
        return push1(st,st1);
        
    }
}
