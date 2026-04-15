package Graph;
import java.util.*;
class PairKey{
    int node;
    int dis;
    PairKey(int node,int dis){
        this.node = node;
        this.dis = dis;
    }
}
public class Dijkstra_Algo {
    public static int[] dijkstra(int V, ArrayList<ArrayList<PairKey>> adj, int src){
        int[] distance = new int[V];
        for(int i=1;i<V;i++){
            distance[i] = Integer.MAX_VALUE;
        }
        PriorityQueue<PairKey> pq = new PriorityQueue<>((a,b) -> a.dis-b.dis);
        pq.add(new PairKey(src,0));
        while(!pq.isEmpty()){
            PairKey curr = pq.remove();
            int node = curr.node;
            int dis = curr.dis;
            for(PairKey ele : adj.get(node)){
              int adjNode = ele.node;
              int weight = ele.dis;
              int totalDis = weight+dis;
              if(totalDis<distance[adjNode]){
                  pq.add(new PairKey(adjNode,totalDis));
                  distance[adjNode] = totalDis;
              }
            }

        }
        return distance;
    }
}
