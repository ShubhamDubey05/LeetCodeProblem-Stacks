import java.util.Stack;


public class stacks {
    
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(8);
        st.push(9);
        st.push(4);
        st.push(3);
        st.push(2);
    System.out.println(st.peek());    
    System.out.println(st);
    System.out.println(st.size());
    st.pop();
    st.pop();
    st.pop();
    st.pop();
    System.out.println(st);
    System.out.println(st.size());
    
}
    
}
