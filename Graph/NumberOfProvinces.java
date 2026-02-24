package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                bfs(i,visited,isConnected);
                count++;
            }
        }
        return count;
    }
    public void bfs(int i,boolean[] visited,int[][] isConnected){
        Queue<Integer> qt = new LinkedList<>();
        qt.add(i);
        visited[i] = true;
        while(qt.size()>0){
            int front = qt.remove();
            for(int j=0;j<isConnected.length;j++){
                if(isConnected[front][j]==1 && !visited[j]){
                    qt.add(j);
                    visited[j] = true;
                }
            }
        }
    }

}
