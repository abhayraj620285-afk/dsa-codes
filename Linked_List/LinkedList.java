package Linked_List;
import java.util.*;
class LinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }
    }

     Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void findMiddle() {
        if (head == null) {
            System.out.println("Empty Stack");
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle element found: " + slow.data);
    }



    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.findMiddle();


    }
}
