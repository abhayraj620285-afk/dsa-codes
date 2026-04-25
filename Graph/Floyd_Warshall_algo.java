package Graph;
import java.util.*;
public class Floyd_Warshall_algo {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {

        int[][] adj = new int[n][n];
        for(int[] ele : adj){
            Arrays.fill(ele,Integer.MAX_VALUE);
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            adj[u][v] = wt;
            adj[v][u] = wt;
        }
        // FLOYD WARSHALL ALGO
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
               for(int j=0;j<n;j++){
                   if(adj[i][k]==Integer.MAX_VALUE ||adj[k][j]==Integer.MAX_VALUE ) continue;
                   adj[i][j] = Math.min(adj[i][k]+adj[k][j],adj[i][j]);
               }
            }
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(adj[i][j]<=distanceThreshold){
                    ans[i]++;
                }
            }
        }
        int minDis = Integer.MAX_VALUE;
        for(int i=0;i<ans.length;i++){
         minDis = Math.min(ans[i],minDis);
        }
        return minDis;
    }
}
