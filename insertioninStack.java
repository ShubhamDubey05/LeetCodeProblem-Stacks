import java.util.Scanner;
import java.util.Stack;

public class insertioninStack {
    public static void main(String[] args) {


          Stack<Integer> st= new Stack<>();
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of element ,you want to insert");
    int n = in.nextInt();
    System.out.println("Enter the number of elements");
    for(int i =1; i<=n; i++){
        int x = in.nextInt();
        st.push(x);
    }
     System.out.println(st);
     

     // insertion at any idx
     int idx =2;
     int x =9;

    Stack<Integer> temp = new Stack<>();
    while(st.size()>idx){
        temp.push(st.pop());
    }
    System.out.println(st);
    st.push(x);
     while(temp.size()>0){
        st.push(temp.pop());
     }
     System.out.println(st);
     System.out.println(temp);


    
}
    
}
