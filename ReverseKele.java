import java.util.*;
public class ReverseKele {
    static void main() {
        Queue<Integer> qt = new LinkedList<>();
        for(int i=1;i<=6;i++){
            qt.add(i);
        }
        Stack<Integer> st = new Stack<>();
        int k = 2;
        int n = qt.size();
        int x = 0;
        while(x++!=k) st.push(qt.remove());
        while(st.size()!=0) qt.add(st.pop());
        x = 0;
        while(x++!=n-k){
            qt.add(qt.remove());
        }
        while(qt.size()!=0) System.out.println(qt.remove());
    }
}
