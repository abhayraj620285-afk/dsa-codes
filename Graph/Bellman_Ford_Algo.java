package Graph;
import java.util.*;
// LeetCode 743
public class Bellman_Ford_Algo {
    public int networkDelayTime(int[][] times, int n, int src){
        int[] dis = new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[src] = 0;
        for(int i=0;i<n-1;i++){
            for (int[] time : times) {
                int u = time[0];
                int v = time[1];
                int weight = time[2];
                if(dis[u]!=Integer.MAX_VALUE && dis[u]+weight<dis[v]){
                    dis[v] = dis[u]+weight;
                }
            }
        }
        // nth time relaxation for -ve detection
        for (int[] time : times) {
            int u = time[0];
            int v = time[1];
            int weight = time[2];
            if(dis[u]!=Integer.MAX_VALUE && dis[u]+weight<dis[v]){
               return -1; // Indicating that a negative cycle is caught
            }
        }
        int maxVal = -1;
        for(int i=1;i<=n;i++){
            maxVal = Math.max(maxVal,dis[i]);
            if(dis[i]==Integer.MAX_VALUE) return -1;
        }
        return maxVal;

    }

}
