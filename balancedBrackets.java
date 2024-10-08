import java.util.*;

public class balancedBrackets {


    public static  Boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i = 0; i<n;i++){
            char ch = str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()==0) return false;
                else if(st.peek()=='(') st.pop();
            }
        }
            if(st.size()>0) return false;
            return true;

    }
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
String str= in.nextLine();
System.out.println(isBalanced(str));



    
}

}
