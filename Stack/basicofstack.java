package Stack;

import java.util.Stack;

public class basicofstack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        // to check stack is empty or not
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(23);
        st.push(15);
        st.push(45);
        System.out.println(st.isEmpty());
        System.out.println(st);
        System.out.println(st.size());
        for(int i=1;i<=st.size();i++){
            st.pop();
        }
        System.out.println(st.size());
        System.out.println(st);
    }
}
