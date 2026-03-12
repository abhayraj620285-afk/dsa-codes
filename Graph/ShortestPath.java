package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {
    public int shortestPathBinaryMatrix(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited= new int[n][n];
        Queue<Triplet> qt = new LinkedList<>();
        qt.add(new Triplet(0,0,1));
        visited[0][0] = 1;
        int maxTime = 0;
        while(qt.size()>0){
            Triplet x = qt.remove();
            int row = x.row;
            int col = x.col;
            int time = x.time;
            maxTime = Math.max(maxTime,time);
            if(row+1<m && col+1<n && grid[row+1][col+1]==0 && visited[row+1][col+1]==0){
                visited[row+1][col+1] = 1;
                qt.add(new Triplet(row+1,col+1,time+1));
            }
            if(row-1>=0 && col-1>=0 && grid[row-1][col-1]==0 && visited[row-1][col-1]==0){
                visited[row-1][col-1] = 1;
                qt.add(new Triplet(row-1,col-1,time+1));
            }
            if(row+1<m && col-1>=0 && grid[row+1][col-1]==0 && visited[row+1][col-1]==0){
                visited[row+1][col-1] = 1;
                qt.add(new Triplet(row+1,col-1,time+1));
            }
            if(row-1>=0 && col+1<n && grid[row-1][col+1]==0 && visited[row-1][col+1]==0){
                visited[row-1][col+1] = 1;
                qt.add(new Triplet(row-1,col+1,time+1));
            }

            if(row-1>=0 && grid[row-1][col]==0 && visited[row-1][col]==0){
                visited[row-1][col]=1;
                qt.add(new Triplet(row-1,col,time+1));

            }
            if(row+1< grid.length && grid[row+1][col]==0 && visited[row+1][col]==0){
                visited[row+1][col]=1;
                qt.add(new Triplet(row+1,col,time+1));

            }
            if(col-1>=0 && grid[row][col-1]==0 && visited[row][col-1]==0){
                visited[row][col-1]=1;
                qt.add(new Triplet(row,col-1,time+1));

            }
            if(col+1<grid[row].length && grid[row][col+1]==0 && visited[row][col+1]==0){
                visited[row][col+1]=1;
                qt.add(new Triplet(row,col+1,time+1));

            }
            if(row==n-1 && col==n-1 ) return maxTime;
        }
        return -1;
    }
}
