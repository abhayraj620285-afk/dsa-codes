package BinarySearchTree;
import java.util.*;
public class BSTInsert {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
        public static Node insert(Node root,int x){
            Scanner sc = new Scanner(System.in);
            Node t = root;
            Node q = null;
            while (t != null) {
                q = t;
                if(x<t.val){
                    t = t.left;
                }
                else t = t.right;
            }
            if(q==null){

                Node temp = new Node(x);
                return temp;
            }
            else{
                if(x<q.val){
                    Node ins = new Node(x);
                    q.left = ins;
                }
                else{
                    Node in2 = new Node(x);
                    q.right = in2;
                }
            }
            return root;
        }


        public static void main(String[] args) {

        }
    }
}
