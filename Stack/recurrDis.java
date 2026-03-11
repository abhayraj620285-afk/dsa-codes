package Stack;

import java.util.Stack;

public class recurrDis {
   public static void displayrecur(Stack<Integer> st){
        if(st.size()==0) {
            System.out.println(st.push(01));
            return;
        }
        int x = st.pop();

       displayrecur(st);
       System.out.println(x);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(23);
        st.push(21);
        st.push(45);
        st.push(69);
        st.push(76);
        displayrecur(st);

    }

}
