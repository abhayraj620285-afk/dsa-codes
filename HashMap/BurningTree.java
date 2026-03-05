package HashMap;
import java.util.*;

public class BurningTree {
    static Node start;
    static HashMap<Node,Node> mp;
    public static int minTree(Node root,int target){
        int ans = 0;
        mp = new HashMap<>();
        HashSet<Node> set = new HashSet<>();
        dfs(root,target);
        Queue<pair> qt = new LinkedList<>();
        qt.add(new pair(start,0));
        int time = 0;
        while(qt.size()>0){
            pair top = qt.remove();
            Node temp = top.node;
            int dis = top.dis;
            time = Math.max(dis,time);
            if(temp.left!=null && !set.contains(temp.left)) {
                qt.add(new pair(temp.left,dis+1));
                set.add(temp.left);
            }
            if(temp.right!=null && !set.contains(temp.right)) {
                qt.add(new pair(temp.right,dis+1));
                set.add(temp.right);
            }
            if(mp.containsKey(temp) && !set.contains(temp.left)) {
                qt.add(new pair(mp.get(temp),dis+1));
                set.add(mp.get(temp));
            }
        }

        return ans;
    }
    public static void dfs(Node root,int target){
        if(root==null) return;
        if(root.data==target) start = root;
        if(root.left!=null) mp.put(root.left,root);
        if(root.right!=null) mp.put(root.right,root);
        dfs(root.left,target);
        dfs(root.right,target);
    }
}