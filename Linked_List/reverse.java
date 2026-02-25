package Linked_List;

public class reverse {
    public static class Node{
        int val;
        Node Next;
        Node(int val){
            this.val = val;
        }
    }
    public static Node reverse(Node head){
        if(head.Next==null) return head;
        Node newhead = reverse(head.Next);
        head.Next.Next = head;
        head.Next=null;
        return newhead;
    }
    public static void display(Node head){
        if(head==null) return ;
        System.out.println(head.val+" ");
        display(head.Next);

    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(6);
        a.Next = b;
        b.Next = c;
        c.Next = d;
        d.Next = e;
        display(a);

    }
}
