package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] visited = new int[n];
       for(int i=0;i<n;i++){
           if(visited[i]==0){
               if(bfs(i,visited,graph)) return true;
           }
       }
    return false;
    }
    public boolean bfs(int src,int[] visited,int[][] graph){
        Queue<Integer> qt = new LinkedList<>();
        qt.add(src);
        visited[src] = 1;
        while(!qt.isEmpty()){
            int x = qt.remove();
            for(int ele : graph[x]){
                if(visited[ele]==0){
                    visited[ele] = visited[x]+1;
                    qt.add(ele);
                }
                else if(visited[ele]==visited[x]){
                    return false;
                }
            }
        }
        return true;
    }
}
