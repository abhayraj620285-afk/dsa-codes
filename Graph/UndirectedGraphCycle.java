package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Pair1{
    int node;
    int parent;
    Pair1(int node,int parent){
        this.node = node;
        this.parent = parent;
    }
}
public class UndirectedGraphCycle {
    public boolean isCycle(int V, int[][] edges) {
        int n = V;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
       for(int i=0;i<adj.size();i++){
           if(!visited[i]){
              if(bfs(i,visited,adj)) return true;
           }
       }

    return false;
    }
    public boolean bfs(int src,boolean[] visited, ArrayList<ArrayList<Integer>> adj){
    visited[src] = true;
        Queue<Pair1> qt = new LinkedList<>();
        qt.add(new Pair1(src,-1));
        while(!qt.isEmpty()){
            Pair1 x = qt.remove();
            int node = x.node;
            int parent = x.parent;
            for(int ele : adj.get(node)){
                if(!visited[ele]){
                    qt.add(new Pair1(ele,node));
                    visited[ele] = true;

                }
                else if(ele!=parent) return true;
            }
        }
        return false;
    }

}
