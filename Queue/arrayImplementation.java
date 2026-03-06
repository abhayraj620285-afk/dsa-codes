package Queue;
import java.util.*;
public class arrayImplementation {
    public static class queueA{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[100];
        public void add(int val){
            if(rear == arr.length-1){
                System.out.println("Queue is full");
            }
            if(front == -1){
                front = rear = 0;
                arr[0] = val;
            }
            else{
                arr[++rear] = val;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            front++;
            size--;
            return arr[front-1];
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
            if(size==0) System.out.println("Empty Queue");
            else{
                for(int i=front;i<rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }

        public static void main(String[] args) {
            queueA q = new queueA();
            q.display();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.display();
            q.remove();
            q.display();
        }
    }
}
