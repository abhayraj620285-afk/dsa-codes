package Graph;

import java.util.PriorityQueue;
import java.util.*;
public class Kruskal_Algo {
    static int[] parent;
    static int[] size;

    public int leader(int a){
        if(parent[a]==a) return a;
        return parent[a] = leader(parent[a]);
    }
    public void union(int a,int b){
        a = leader(a);
        b = leader(b);
        if(a!=b){
            if(size[a]>size[b]){
                parent[a] = b;
                size[a]+=size[b];
            }
            else{
                parent[b] = a;
                size[b]+=size[a];
            }
        }
    }
    public int minCostConnectPoints(int[][] points){
        int n = points.length;
        parent = new int[n];
        size = new int[n];
        for(int i=0;i<n;i++){
            parent[i] = i;
            size[i] = 1;
        }
        PriorityQueue<TriVal> pq = new PriorityQueue<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int x1 = points[i][0];
                int x2 = points[i][1];
                int y1 = points[j][0];
                int y2 = points[j][1];
                int dis = Math.abs(x1-y1)+Math.abs(x2-y2);
                pq.add(new TriVal(i,j,dis));
            }
        }
        int sum = 0;
        while(!pq.isEmpty()){
            TriVal ele = pq.remove();
            int i = ele.i;
            int j = ele.j;
            int diff = ele.diff;
            if(leader(i)!=leader(j)){
                sum+=diff;
                union(i,j);
            }
        }
        // using arrayList
//        Collections.sort(list);
//        int sum = 0;
//        for(int i=0;i<list.size();i++){
//            TriVal ele = list.get(i);
//            int u = ele.i , v = ele.j , dis = ele.diff;
//            if(leader(u)!=leader(v)){
//                sum+=dis;
//                union(u,v);
//            }
//        }

        return sum;
    }
}
