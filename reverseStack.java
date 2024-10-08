import java.util.Stack;

public class reverseStack {
    
    public static void main(String[] args) {
     Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(8);
        st.push(9);
        st.push(4);
        st.push(3);
        st.push(2);

        System.out.println(st);
        Stack<Integer> temp = new Stack<>();
        while(st.size()>0){
            temp.push(st.pop());
        }
        System.out.println(temp);

       while(temp.size()>0){
        st.push(temp.pop());
       }
       System.out.println(st);
}
    
}
