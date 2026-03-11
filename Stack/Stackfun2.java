package Stack;

public class Stackfun2 {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack{
        private Node head = null;
        private int size = 0;
        // for putting elements
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        // for poping elements
        int pop(){
            if(head==null){
                System.out.println("Empty Stack");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }
        // for peek
        int peek(){
            if(head==null){
                System.out.println("Empty Stack");
                return -1;
            }
            return head.val;
        }
        // recurssively reversing linked list
        void displayrec(Node h){
            if(h==null) return ;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        // helper function to display stack elements
        void display(){
            displayrec(head);
            System.out.println();
        }
    }
}
