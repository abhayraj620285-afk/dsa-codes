package Linked_List;

public class doublylLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display2(Node random){
        Node temp = random;
        while(temp.prev!=null){

            temp = temp.prev;

        }
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
    public static void insertAtend(Node head) {
        Node t = new Node(9);
        t.next = head;
        head.prev = t;
        head = t;

    }
    public static void insertAt(Node head,int x,int pos){
        Node newNode = new Node(x);
        Node temp = head;
        for(int i=0;i<pos;i++){
            temp = temp.next;
        }
        Node r = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = r;
        r.prev = newNode;

    }


    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(8);
        Node c = new Node(4);
        Node d = new Node(6);
        Node e = new Node(1);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        display2(c);
        System.out.println("After insertion: ");
        insertAt(a,3,35);
        display(a);
    }
}
