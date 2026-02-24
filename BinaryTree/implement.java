package BinaryTree;
import java.util.Collections;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class implement {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void display(Node root){
        if(root == null) return ;
        System.out.print(root.val+" -> ");
        if(root.left!=null) System.out.print(root.left.val+" ");
        if(root.right!=null) System.out.print(root.right.val+" ");
        System.out.println();
        display(root.left);
        display(root.right);
    }
    public static void preorder(Node root){
        if(root == null) return;
        System.out.println(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static void nthLevel(Node root,int n){
    if(root==null) return ;
    if(n==1){
        System.out.println(root.val+" ");
        return;
    }
    nthLevel(root.left,n-1);
    nthLevel(root.right,n-1);
    }

    public static int sum(Node root){
        if(root==null) return 0;
        int left = sum(root.left);
        int right = sum(root.right);
        return left+right+root.val;
    }
    public static int product(Node root){
        if(root==null) return 1;
        return root.val *product(root.left) * product(root.right);
    }
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a,Math.max(b,c));
    }
    public static int height(Node root){
        if(root==null ||  (root.left==null && root.right==null)) return 0;
        // iske wajse hame starting node se height nahi milega
        return 1+Math.max(height(root.left),height(root.right));
    }
    // ***** // most imp concept using queue
    public static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node temp = q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            System.out.print(temp.val +" ");
            q.remove();
        }
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left = a;
        root.right = b;
        Node c = new Node(8);
        Node d = new Node(1);
        a.left = c;
        a.right = d;
        Node e = new Node(1);
        b.right = e;
        display(root);
        preorder(root);
        System.out.println("Sum :" +sum(root));
        System.out.println("max :"+max(root));
        System.out.println("Height :" + height(root));
        //System.out.println("product :" + product(root));
        //bfs(root);
        int level = height(root) +1;
        for(int i=0;i<level;i++){
            nthLevel(root,i);
        }
    }
}
