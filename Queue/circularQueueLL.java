package Queue;

public class circularQueueLL {
    public static class Node{
        int val ;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class CqueueLL{
        Node front = null;
        Node rear = null;
        int size = 0;
        public void add(int x){
            Node temp = new Node(x);
            if(rear==null){
                front = rear = temp;
                rear.next = front;
            }
            else{
                rear.next = temp;
                rear = temp;
                rear.next = front;
            }
            size++;
        }
        public int remove(){
            if(rear==null){
                System.out.println("empty");
            }
            int val = front.val;
             if(front==rear){
                front = rear = null;

            }
             else{

                 front = front.next;
                 rear.next = front;

             }
             size--;
            return val;
        }
    }
    public static void main(String[] args) {

    }
}
