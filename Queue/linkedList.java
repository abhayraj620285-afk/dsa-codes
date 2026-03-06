package Queue;
import java.util.*;
public class linkedList {
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
      public static class queueLL{
            Node front = null;
            Node rear = null;
            int size = 0;
            public void add(int x){
               Node newNode = new Node(x);
                if(size==0){
                    rear = newNode;
                    front = newNode;
                }
                rear.next = newNode;
                rear = newNode;
                size++;
            }
            public int peek(){
                if(size==0){
                    System.out.println("Queue is Empty");
                    return -1;
                }
                int x = front.val;
                return x;
            }
            public int remove(){
                if(size==0){
                    System.out.println("Queue is Empty");
                    return -1;
                }
                int x = front.val;
                front = front.next;
                size--;
                return x;
            }
            public void display(){


                if(front==null){
                    System.out.println("no elements");
                    return;
                }
                Node temp = front;
                while(temp!=null){
                    System.out.println(temp.val+ " ");
                    temp = temp.next;
                }
            }



    }
    public static void main(String[] args) {
        queueLL q1 = new queueLL();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.display();
    }
}
