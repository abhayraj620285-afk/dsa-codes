package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class MonotonicStack {
    static void main() {
        int[] arr = {4,2,5,1,3};
        Stack<Integer> st = new Stack<>();
        // Monotonic Increasing Stack
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                    st.pop();
            }
            st.push(i);
        }
        System.out.println("Index of Monotonic increasing stack");
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

    }
}
