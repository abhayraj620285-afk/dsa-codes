package Heap;
import java.util.*;
class Triplet implements Comparable<Triplet>{
    int dis;
    int x;
    int y;
    Triplet(int dis,int x,int y){
        this.dis = dis;
        this.x = x;
        this.y = y;
    }
    public int compareTo(Triplet t){
        return Integer.compare(this.dis, t.dis);
    }
}
public class KClosetPointToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
    for(int[] point : points){
        int x = point[0];
        int y = point[1];
        int dis = x*x + y*y;
        pq.add(new Triplet(dis,x,y));
        if(pq.size()>k) pq.remove();
    }
    int[][] ans = new int[k][2];
    for(int i=0;i<k;i++){
        Triplet top = pq.remove();
        ans[i][0] = top.x;
        ans[i][1] = top.x;
    }
    return ans;
    }
}
