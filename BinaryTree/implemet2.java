package BinaryTree;
import java.util.*;
import java.util.Scanner;
public class implemet2 {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);

    }
    public static void inorder(Node root){
        if(root==null) return;

        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);

    }
    public static void postorder(Node root){
        if(root==null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);

    }
    public static int height(Node root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    // function to calculate number of nodes
    public static int countNodes(Node root){
        if(root==null) return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    public static void createTree(Node root){
        Scanner sc = new Scanner(System.in);
        System.out.println("wether left of root exist or not: 1 or 0 " );
        int choice  = sc.nextInt();
        if(choice==1){
            System.out.println("Enter value of left tree:");
            int val = sc.nextInt();
            Node left1 = new Node(val);
            root.left = left1;
            createTree(left1);
        }
        System.out.println("wether right of root exist or not: 1 or 0 " );
        int choice1  = sc.nextInt();
        if(choice1==1){
            System.out.println("Enter value of right tree:");
            int val = sc.nextInt();
            Node right1 = new Node(val);
            root.right = right1;
            createTree(right1);
        }
    }
    public static int leaf(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        return leaf(root.left) + leaf(root.right);
    }
    public static boolean complete(Node root){
        if(root==null) return true;
        int left = height(root.left);
        int right = height(root.right);
        if(left!=right) return false;
        return complete(root.left) && complete(root.right);

    }
    public static boolean perfect(Node root){
        Queue<Node> qt = new LinkedList<>();
        if(root!=null) qt.add(root);
        boolean check = false;
        while(qt.size()>0){
            Node temp = qt.peek();

           if(temp==null) return true;


            if(temp.left!=null) qt.add(root.left);
            if(temp.right!=null) qt.add(root.right);
            qt.remove();

        }
        return true;

    }

    public static void main(String[] args) {
    Node root = new Node(4);
    Node a = new Node(3);
    Node b = new Node(5);
    root.left = a;
    root.right = b;
    Node c = new Node(3);
    Node d = new Node(5);
    a.left = c;
    a.right = d;
    Node e = new Node(3);
    Node f = new Node(5);
    b.left = e;
    b.right = f;
    //preorder(root);
//        postorder(root);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the root value:");
//        int val = sc.nextInt();
//        Node root1 = new Node(val);
//        createTree(root1);
//        preorder(root1);
        System.out.println("leaf" + leaf(root));
        System.out.println(perfect(root));

    }
}
