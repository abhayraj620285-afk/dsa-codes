package Graph;
import java.util.*;
public class CheapFlight {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<TriVal>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<flights.length;i++){
            adj.get(flights[i][0]).add(new TriVal(flights[i][1],0,0));
        }
        int[] ans = new int[n];
        Arrays.fill(ans,Integer.MAX_VALUE);
        PriorityQueue<TriVal> pq = new PriorityQueue<>();
        pq.add(new TriVal(src,0,0));
        ans[src] = 0;
        while(!pq.isEmpty()){
            TriVal tripal = pq.remove();
            int node = tripal.i;
            int count = tripal.j;
            int amount = tripal.diff;
            if(node==dst) return ans[node];
            if(count==k+1) continue;
            for(TriVal ele : adj.get(node)){
                int n1 = ele.i;
                int c1 = ele.j;
                int a1 = ele.diff;
                int finalAmount = amount+a1;
               if(finalAmount<ans[n1]){
                   ans[n1] = finalAmount;
                   pq.add(new TriVal(n1,c1+1,finalAmount));
               }

            }
        }

    return -1;
    }
}
