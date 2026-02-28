package BinarySearchTree;
import java.util.*;
// inorder traversal -> morris traversal
public class Morris_Traversal {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void Morris_trav(Node root,ArrayList<Integer> list){
        Node curr = root;
        while(curr!=null){
            if(curr.left!=null){
                Node pred = curr.left;
                // checking for if pred.right has connected to curr and making infinte movement in it
                while(pred.right!=null && pred.right!=curr){
                    pred = pred.right;
                }
                if(pred.right==null){
                    pred.right = curr;
                    curr = curr.left;
                }
                if(pred.right==curr){ // deleting my temporary connection which cause infinite loop
                    pred.right = null;
                    list.add(curr.val);
                    curr = curr.right;
                }
            }
            else{
                list.add(curr.val);
                curr = curr.right;
            }
        }
    }
}
