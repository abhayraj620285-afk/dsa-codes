package Graph;
import java.util.*;

public class Disjoint_set_union {
    static int [] parent;
    static int[] size;
    public int find(int a){
        if(parent[a]==a) return a;
        return parent[a] = find(parent[a]);
    }

    public void union(int a ,int b){
         a = find(a);
         b = find(b);
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
    public int findCircularInt(int[][] connected) {
        int n = connected.length;
        parent = new int[n + 1];
      for(int i=1;i<=n;i++){
          parent[i] = i;
          size[i] = 1;
      }
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < n; j++) {
               if(connected[i][j]==1) union(i + 1, j + 1);
            }
        }
        return parent[0];
    }
}
