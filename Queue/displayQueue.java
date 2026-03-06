package Queue;
import java.util.*;
public class displayQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
       // System.out.println("old queue:" + q);
        Queue<Integer> helper  = new ArrayDeque<>();
        while(q.size()>0){
            int x = q.remove();
            System.out.println("displayQueue:" + x);
            helper.add(x);

        }
        System.out.println("helper queue:" +helper);
        while(helper.size()>0){
            int y = helper.remove();

            q.add(y);
        }
        System.out.println("new Queue:" + q);

    }

}
