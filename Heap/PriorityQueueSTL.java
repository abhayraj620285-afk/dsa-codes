package Heap;
import java.util.*;
public class PriorityQueueSTL {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(90);
        pq.add(2);
        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq.peek());
        // we can also iitrate in priorityQueue
        System.out.println("Iterating in priorityQueue : ");
        for(int ele : pq){
            System.out.print(ele + " ");
        }
    }
}
