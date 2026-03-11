package Stack;

import java.util.Stack;

public class revStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(23);
        st.push(21);
        st.push(45);
        st.push(69);
        st.push(76);

        Stack<Integer> temp1 = new Stack<>();
        while(st.size()>0){
            temp1.push(st.pop());
        }
        System.out.println("stack temp1" + temp1);
        Stack<Integer> temp2 = new Stack<>();
        while(temp1.size()>0){
            temp2.push(temp1.pop());
        }
        System.out.println("Stack temp2" + temp2);
        while(temp2.size()>0){
            st.push(temp2.pop());
        }
        System.out.println("stack after reverse " + st);
    }
}
