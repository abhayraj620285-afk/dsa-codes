package Queue;
import java.util.*;
import java.util.LinkedList;

public class basicSTL {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.size());
        System.out.println(q);
        q.remove();
        System.out.println("After removing:"+ q);
        q.poll();
        System.out.println("After removing using poll:" +q);
        System.out.println(q.peek());
    }
}
