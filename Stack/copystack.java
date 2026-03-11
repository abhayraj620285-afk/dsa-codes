package Stack;
import java.util.*;
public class copystack {
    public static void main(String[] args) {


        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter no. of ele in stack");
        n = sc.nextInt();

        System.out.println("Enter elements :");
        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
           st.push(x);
        }


        System.out.println("Stack before copying :");
        System.out.println(st);
        Stack<Integer> str = new Stack<>();
        while(st.size()>0){
            str.push(st.peek());
            st.pop();
        }
        System.out.println("after");
        System.out.println(str);

    }
}
