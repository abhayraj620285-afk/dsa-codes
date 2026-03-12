package Graph;
import java.util.*;
public class TopologicalSort {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[V];
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            indegree[i]++;
        }
        Queue<Integer> qt = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                qt.add(V);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(qt.size()>0){
            int x = qt.remove();
            ans.add(x);
           for(int ele : adj.get(x)){
               if(indegree[ele]!=0){
                   indegree[ele]-=1;
                   if(indegree[ele]==0){
                       qt.add(ele);
                   }
               }
           }
        }
        return ans;
    }
}
