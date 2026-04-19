package Graph;
import java.util.*;
import java.util.PriorityQueue;

// LeetCode 1584
public class PrismAlgo {
    public int minCostConnectPoints(int[][] points) {
        int sum = 0;
        PriorityQueue<TriVal> pq  = new PriorityQueue<>();
        boolean[] visited = new boolean[points.length];
        pq.add(new TriVal(0,-1,0));

        while(!pq.isEmpty()){
            TriVal val = pq.remove();
            int node = val.i;
            int parent = val.j;
            int weight = val.diff;

            if(visited[node]) continue;
            sum+=weight;
            visited[node] = true;
            for(int i=0;i<points.length;i++){
                if(i==node) continue;
                if(!visited[i]){
                    int x1 = points[node][0],x2 = points[node][1];
                    int y1 = points[i][0],y2 = points[i][1];
                    int dis = Math.abs(x1-y1)+Math.abs(x2-y2);

                    pq.add(new TriVal(i,node,dis));
                }
            }

        }
        return sum;
    }

}
