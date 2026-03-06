package Queue;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        Queue<Integer> qt = new LinkedList<>();
        Queue<Integer> temp = new LinkedList<>();
        int n = qt.size();
        qt.add(1);
        qt.add(2);
        qt.add(4);
        qt.add(5);
        qt.add(8);
        qt.add(9);
        qt.add(6);
        qt.add(7);
        System.out.println(qt);
        while(qt.size()!=n-k){
            st.push(qt.remove());
        }
        while(qt.size()!=0){
            temp.add(qt.remove());
        }

        while(st.size()!=0){
            qt.add(st.pop());
        }
        while(temp.size()!=0){
            qt.add(temp.remove());
        }
        System.out.println(qt);

    }
}
