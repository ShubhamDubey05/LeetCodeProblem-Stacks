import java.util.Scanner;
import java.util.Stack;

public class displayStack {

    // reverse stack using recursion

        public static  void displayrev(Stack<Integer>temp){

            if(temp.size()==0){
                return ;
            }
            int top = temp .pop();
            System.out.print(top+" ");
            displayrev(temp);
           // temp.push(top);

         }

         // dispaly stack using recursion

         public static  void displayrec(Stack<Integer>temp){

            if(temp.size()==0){
                return ;
            }
            int top = temp .pop();
            displayrec(temp);
            System.out.print(top+" ");
           temp.push(top);

         }



    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of element ,you want to insert");
        int n = in.nextInt();
        System.out.println("Enter the number of elements");
        for (int i = 1; i <= n; i++) {
            int x = in.nextInt();
            st.push(x);
        }
          System.out.println(st);

          
        Stack<Integer> temp = new Stack<>();
        while (st.size() > 0) {
            temp.push(st.pop());
        }
        while(temp.size()>0){
            int x = temp.pop();
            System.out.print(x+" ");
            st.push(x);
        }
        System.out.println(st);



// using Array


            int size = st.size();
            int [] arr = new int[size];
            for(int i =n-1 ; i>=0 ;i--){
                arr[i] =st.pop();
            }

            for(int i = 0; i<n ; i++){
                System.out.print(arr[i]+" ");
                st.push(arr[i]);
            }

            // using recursion
          
            displayrev(st);
            displayrec(st);

    }

}
