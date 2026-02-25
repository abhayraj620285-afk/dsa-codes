package Linked_List;

public class PolyMulti {
    public static class Node{
        int coeff;
        int exp;
        Node Next;
        Node(int coeff,int exp){
            this.coeff = coeff;
            this.exp = exp;
        }
    }
    public static Node insertEnd(Node head,int coeff,int exp){
        Node newNode = new Node(coeff,exp);
        if(head==null) return newNode;
        Node temp = head;
        while(temp.Next!=null){
            temp = temp.Next;
        }
        temp.Next = newNode;
        return head;
    }
    public static Node multiply(Node poly1,Node poly2){
        Node result = null;
        Node ptr1 = poly1;
        Node ptr2 = poly2;
        while(ptr1 !=null){
            while(ptr2 != null){
                int coeff = ptr1.coeff * ptr2.coeff;
                int exp = ptr1.exp + ptr2.exp;
                result = insertEnd(result,coeff,exp);
                ptr2 = ptr2.Next;
            }
            ptr1 = ptr1.Next;
        }
        return result;

    }
    static void printPoly(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.coeff + "x^" + temp.exp);
            if (temp.Next != null) System.out.print(" + ");
            temp = temp.Next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Polynomial 1: 3x^2 + 2x + 1
        Node poly1 = null;
        poly1 = insertEnd(poly1, 3, 2);
        poly1 = insertEnd(poly1, 2, 1);
        poly1 = insertEnd(poly1, 1, 0);

        // Polynomial 2: 4x + 2
        Node poly2 = null;
        poly2 = insertEnd(poly2, 4, 1);
        poly2 = insertEnd(poly2, 2, 0);

        System.out.print("Polynomial 1: ");
        printPoly(poly1);

        System.out.print("Polynomial 2: ");
        printPoly(poly2);

        Node result = multiply(poly1, poly2);
        System.out.print("Multiplication Result (unsimplified): ");
        printPoly(result);
    }
}
