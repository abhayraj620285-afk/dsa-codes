package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
        // code to delete 0 child node
    public static void delete0(Node root,int target){
           if(root==null) return;
           if(root.val>target){
               if(root.left==null) return ;
               if(root.left.val==target) root.left=null;
               else delete0(root.left,target);
           }
           else{
               if(root.right==null) return ;
               if(root.right.val==target) root.right=null;
               else delete0(root.right,target);
           }
    }
    // code to delete 0 and 1 and 2 child nodes
        public static void delete1(Node root,int target){
            if(root==null) return;
            if(root.val>target){
                if(root.left==null) return ;
                if(root.left.val==target){
                    Node l = root.left;
                    if(l.left==null && l.right==null) root.left=null; // for 0 child
                    else if(l.left==null || l.right==null){
                        if(l.left!=null) root.left = l.left;
                        else root.left = l.right;
                    }
                    // code to delete two nodes 
                    else{
                        if(root.right==null) return ;
                        if(root.right.val==target) {
                            Node r = root.right;
                            if(r.left==null && r.right==null) root.right=null; // for 0 child
                            else if(r.left==null || r.right==null){
                                if(r.left!=null) root.right = r.left;
                                else root.right = r.right;
                            }
                            else{
                                Node curr = r;
                                Node pred = curr.left;
                                while(pred.right!=null){
                                    pred = pred.right;
                                }
                                delete1(curr,pred.val);
                                pred.left = curr.left;
                                pred.right = curr.right;
                                root.right = pred;
                            }
                        }
                        else delete1(root.right,target);
                    }
                }
                else delete1(root.left,target);
            }
            else{
                if(root.right==null) return ;
                if(root.right.val==target) {
                    Node r = root.right;
                    if(r.left==null && r.right==null) root.right=null; // for 0 child
                    else if(r.left==null || r.right==null){
                        if(r.left!=null) root.right = r.left;
                        else root.right = r.right;
                    }
                }
                else delete1(root.right,target);
            }
        }
    public static Node constructbfs(String[] arr) {
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        Node root = new Node(x);
        Queue<Node> qt = new LinkedList<>();
        qt.add(root);
        int i = 1;
        while (i < n - 1) {
            Node temp = qt.remove();
            Node left = new Node(10);
            Node right = new Node(100);
            if (arr[i].equals("")) left = null;
            else {
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                qt.add(left);
            }
            if (arr[i + 1].equals("")) right = null;
            else {
                int r = Integer.parseInt(arr[i + 1]);
                right.val = r;
                qt.add(right);

            }
            temp.left = left;
            temp.right = right;
            i+=2;
        }
        return root;

    }
    }
}
