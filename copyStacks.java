import java.util.Scanner;
import java.util.Stack;

public class copyStacks {
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

// reverse order
     Stack<Integer>newst=new Stack<>();
     while(st.size()>0){
            newst.push(st.pop());
            
     }
  //   same order
  Stack<Integer>samest=new Stack<>();
  while(newst.size()>0){
    samest.push(st.pop());
  }
    System.out.println(samest);
    System.out.println(st);
}
    
}
