package HashMap;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
}
class pair{
    int dis;
    Node node;
    pair(Node node,int dis){
        this.node = node;
        this.dis = dis;
    }
}
public class TopViewofBT {
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        Queue<pair> qt = new LinkedList<>();
        qt.add(new pair(root, 0));
        int minDis = Integer.MAX_VALUE;
        int maxDis = Integer.MIN_VALUE;
        while (qt.size() > 0) {
            pair front = qt.remove();
            Node node = front.node;
            int dis = front.dis;
            minDis = Math.min(minDis, dis);
            maxDis = Math.max(maxDis, dis);
            if (!mp.containsKey(dis)) mp.put(dis, node.data);
            if (node.left != null) qt.add(new pair(node.left, dis - 1));
            if (node.right != null) qt.add(new pair(node.right, dis + 1));
        }
        for (int i = minDis; i <= maxDis; i++) {
            ans.add(mp.get(i));
        }
        return ans;
    }
}

