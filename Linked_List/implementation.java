package Linked_List;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val) {
        Node temp = new Node(val);
            if (head == null) {
            head = temp;
            }
            else{
                tail.next = temp;

            }
            tail = temp;
        }
        void insertAt(int index,int val){
            Node t = new Node(val);
            Node temp = head;
            if(index==0){
                insertAtHead(val);
                return;
            }
            else if(index == size()){

                insertAtEnd(val);
                return;
            }
            else if (index<0 || index>size()){
                System.out.println("wrong index");
                return;
            }
            for(int i=1;i<index;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null){
            temp = head;
            temp = tail;
        }
        else{
           temp.next = head;
            head = temp;
        }
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+",");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            int count = 0;
            Node temp = head;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }


    public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.insertAtEnd(4);
    ll.insertAtEnd(5);
    ll.insertAtEnd(12);
    ll.insertAtEnd(13);
    ll.display();
    ll.insertAt(2,67);
    ll.display();
        System.out.println(ll.size()+" cindex present");
    }
}
