package Heap;
class Node {
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
public class isBinaryTree {
    static int s;
    public boolean isHeap(Node tree) {
         s = size(tree);
        return isMaxHeap(tree) && isCBT(tree, 1);
    }

    public int size(Node root) {
        if (root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    public boolean isMaxHeap(Node root) {
        if (root == null) return true;
        int leftval = (root.left != null) ? root.left.data : Integer.MIN_VALUE;
        int rightval = (root.right != null) ? root.right.data : Integer.MIN_VALUE;
        if (root.data <= leftval || root.data <= rightval) return false;
        return isMaxHeap(root.left) && isMaxHeap(root.right);
    }

    public boolean isCBT(Node root, int idx) {
        if (root == null) return true;
        if(idx>s) return false;
        return isCBT(root.left,2*idx) && isCBT(root.right,2*idx+1);
    }
}



