package Graph;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentMap;

class TriVal implements Comparable<TriVal> {
    int i;
    int j;
    int diff;

    TriVal(int i,int j,int diff){
        this.i = i;
        this.j = j;
        this.diff = diff;
    }
    public int compareTo(TriVal t){
        if(this.diff==t.diff) return this.i-t.i;
        return this.diff-t.diff;
    }
}
public class PathWithMinEffort {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        int[] r = {-1,0,1,0};
        int[] c = {0,-1,0,1};
        int[][] effort = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(effort[i],Integer.MAX_VALUE);
        }
        PriorityQueue<TriVal> pq = new PriorityQueue<>();
        pq.add(new TriVal(0,0,0));
        effort[0][0] = 0;
        while(!pq.isEmpty()){
            TriVal triplet = pq.remove();
            int i = triplet.i;
            int j = triplet.j;
            int diff = triplet.diff;
            if (diff > effort[i][j]) continue;
            for(int k=0;k<=3;k++){
                int newRow = i+r[k];
                int newCol = j+c[k];
                if(newCol<=0 || newRow<=0 || newRow>=m-1 || newCol>=n-1) continue;
                int val = heights[newRow][newCol];
                int valDiff = Math.abs(val-heights[i][j]);
                int max = Math.max(diff,valDiff);
                if(effort[newRow][newCol]>max){
                    effort[newRow][newCol] = max;
                    pq.add(new TriVal(newRow,newCol,max));
                }
            }
        }
        return effort[m-1][n-1];
    }
}
