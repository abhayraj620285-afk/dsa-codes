package Queue;

public class DoublyEndedQueueLL {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
            prev = next = null;
        }
    }
    public static class queue{
            Node front;
            Node rear;
            int size;
          queue() {
            front = rear = null;
            size = 0;
        }
              void insertLeft(int x){
                Node temp = new Node(x);
                if(front==null){
                   front = rear = temp;

                }
            }
    }

    public static void main(String[] args) {

    }
}
