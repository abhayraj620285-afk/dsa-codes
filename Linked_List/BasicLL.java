package Linked_List;

public class BasicLL {
    static int display(Node head,int count){

        Node temp = head;
        if(temp==null) ;
        count++;
        display(temp.next,count++);
        return count;
    }

    public static class Node{
        int data; // value of nodes
        Node next; // address of nodes

        // We have to define constructor

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
    Node a = new Node(5);
    System.out.println(a.next);
        //System.out.println(a.data);
    Node b= new Node(3);
    Node c = new Node(9);
    Node d = new Node(8);
    Node e = new Node(16);
    a.next = b; // 5-> 3 9 8 16
    b.next = c; // 5-> 3-> 9 8 16
    c.next = d; // 5-> 3-> 9-> 8 16
    d.next = e; // 5-> 3-> 9-> 8-> 16
        int count = 0;
        // For displaying linklist using loop
//    Node temp = a;
//    for(int i=1;i<=5;i++){
//        System.out.print(temp.data+" ");
//        temp = temp.next;
//    }
    // printing linked list using recurssion
        display(a,count);

    }
}
