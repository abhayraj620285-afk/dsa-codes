package Heap;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Kth_Smallest_Ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,5,1,7,8,3,6,89};
        System.out.println("Enter Kth smallest element you want to find : ");
        int k = sc.nextInt();
        // Max Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // Min priority Queue
        // PriorityQueue<Integer> pq = new PriorityQueue<>()
        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k) pq.remove();
        }
        System.out.println(pq.peek());
    }
}
