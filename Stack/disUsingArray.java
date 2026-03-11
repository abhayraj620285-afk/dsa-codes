package Stack;

import java.util.Stack;

public class disUsingArray {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(23);
        st.push(21);
        st.push(45);
        st.push(69);
        st.push(76);
        int[] arr = new int[st.size()];
        int i = 0;
        while(st.size()>0){
            arr[i] = st.pop();
            System.out.println(arr[i]);
            i++;
        }


        for(int j=0;j<st.size();j++){
            st.push(arr[j]);
        }
        System.out.println("elements after putting back in stack :");

    }
}
